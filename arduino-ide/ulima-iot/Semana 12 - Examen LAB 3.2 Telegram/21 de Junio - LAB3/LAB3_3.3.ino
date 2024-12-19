#include <WiFi.h>
#include <WiFiClientSecure.h>
#include <UniversalTelegramBot.h>

// Reemplazar con los datos de tu red wifi
const char* ssid = "iPhone de Rodrigo";
const char* password = "12345678";

//Token de Telegram BOT se obtenienen desde Botfather en telegram
#define token_Bot "7296144164:AAFwRAQjXKlVXP49Kgct56AcnW7-YEa-eg8"
// El ID se obtiene de (IDBot) en telegram no olvidar hacer click en iniciar
#define ID_Chat "1968250737"
WiFiClientSecure secured_client;
UniversalTelegramBot bot(token_Bot, secured_client);

//Entradas TELEGRAM
int sensor=33; 
int pot=32;
String mensaje = "";
int valor = 0;
int volt;

//Salidas TELEGRAM
unsigned long tiempoAnterior; //última vez que se realizó el análisis de mensajes
const unsigned long tiempo = 1000;

int led1 = 14;
int led2 = 12;
int pwmLed = 5;
int estadoLed1 = 0;
int estadoLed2 = 0;

//PWM
const int freq = 5000;
const int ledChannel = 0;
const int resolution(8);
bool esperarPWM = false;

void setup() {
  // put your setup code here, to run once:
  Serial.begin(115200);
  pinMode(sensor, INPUT);
  pinMode(pot,INPUT);
  pinMode(led1, OUTPUT); //inicializar  pin 12 digital como salida.
  pinMode(led2, OUTPUT); //inicializar pin 14 digital como salida.
  pinMode(pwmLed, OUTPUT);

  ledcSetup(ledChannel, freq, resolution);
  ledcAttachPin(pwmLed, ledChannel);

  Serial.print("Conectando a la red wifi... ");
  Serial.println(ssid);
  //Seteo de la red Wifi
  WiFi.mode(WIFI_STA);
  WiFi.begin(ssid, password);
  secured_client.setCACert(TELEGRAM_CERTIFICATE_ROOT);
  while (WiFi.status() != WL_CONNECTED) {
    Serial.print(".");
    delay(500);
  }
  Serial.println("");
  Serial.println("Conectado a la red wifi!!!");
  Serial.print("Dirección ip: ");
  Serial.println(WiFi.localIP());//Imprimimos la direción ip local
  bot.sendMessage(ID_Chat, "Sistema preparado para entradas!!!", "");//Enviamos un mensaje a telegram para informar que el sistema está listo
}

void loop() {
  if (millis() - tiempoAnterior > tiempo)
  {
    int numerosMensajes = bot.getUpdates(bot.last_message_received + 1);

    while (numerosMensajes)
    {
      Serial.println("Comando recibido");
      mensajesNuevos(numerosMensajes);
      numerosMensajes = bot.getUpdates(bot.last_message_received + 1);
    }

    tiempoAnterior = millis();
  }
  // put your main code here, to run repeatedly:
  valor=digitalRead(sensor);
  volt=analogRead(pot);
  if(valor==1){
    mensaje="Se detecto movimiento en el pin digital: "+String(sensor);
    bot.sendMessage(ID_Chat, mensaje, "");
  }
  if(volt>2500){
    mensaje="Se detecto un valor elevado del sensor, mide"+String(volt);
    bot.sendMessage(ID_Chat, mensaje, "");
  }
}

void mensajesNuevos(int numerosMensajes)
{
  for (int i = 0; i < numerosMensajes; i++)
  {
    String chat_id = bot.messages[i].chat_id;
    String text = bot.messages[i].text;

    if(esperarPWM){
      int pwmValor = text.toInt();
      if(pwmValor >= 0 && pwmValor <= 255){
        ledcWrite(ledChannel, pwmValor);
        bot.sendMessage(chat_id, "Valor de PWM puesto en " + String(pwmValor), "");
        esperarPWM = false;
      } else{
        bot.sendMessage(chat_id, "Ingresar un valor entre 0 y 255");
      }
    }

    
//////////Luz 1 en el pin 12//////
    if (text == "Luz1on")
    {
      digitalWrite(led1, HIGH); // 
      estadoLed1 = 1;
      bot.sendMessage(chat_id, "Luz 1 encendida", "");
    }

    if (text == "Luz1off")
    {
      estadoLed1 = 0;
      digitalWrite(led1, LOW); // 
      bot.sendMessage(chat_id, "Luz 1 apagada", "");
    }
//////////Luz 2 en el pin 14//////
    if (text == "Luz2on")
    {
      digitalWrite(led2, HIGH); 
      estadoLed2 = 1;
      bot.sendMessage(chat_id, "Luz 2 encendida", "");
    }

    if (text == "Luz2off")
    {
      estadoLed2 = 0;
      digitalWrite(led2, LOW); 
      bot.sendMessage(chat_id, "Luz 2 apagada", "");
    }  

////////Estado de las luces  ///////     

    if (text == "Estado")
    {
      ////Estado luz 1////
      if (estadoLed1)
      {
        bot.sendMessage(chat_id, "Luz 1 encendida", "");
      }
      else
      {
        bot.sendMessage(chat_id, "Luz 1 apagada", "");
      }
      ////Estado luz 2////
      if (estadoLed2)
      {
        bot.sendMessage(chat_id, "Luz 2 encendida", "");
      }
      else
      {
        bot.sendMessage(chat_id, "Luz 2 apagada", "");
      }
    }
///// PWM ////////
    if(text== "Pwm"){
      bot.sendMessage(chat_id, "Ingrese el valor de pwm entre 0 y 255");
      esperarPWM = true;
      }
    }
    
    if (text == "Ayuda")
    {
      String ayuda = "Bienvenido al sistema de control luces con Esp32, " ".\n";
      ayuda += "Estas son tus opciones.\n\n";
      ayuda += "Luz1on: para encender la Luz 1 \n";
      ayuda += "Luz1off: para apagar la luz 1 \n";
      ayuda += "Luz2on: para encender la Luz 2 \n";
      ayuda += "Luz2off: para apagar la luz 2 \n";
      ayuda += "Estado : devuelve el estado actual de las luces\n";
      ayuda += "Pwm: activa el modo PWM\n";
      ayuda += "Ayuda: Imprime este menú \n";
      ayuda += "Recuerda el sistema distingue entre mayuculas y minusculas \n";
      bot.sendMessage(chat_id, ayuda, "");
    }
    
  }
}
