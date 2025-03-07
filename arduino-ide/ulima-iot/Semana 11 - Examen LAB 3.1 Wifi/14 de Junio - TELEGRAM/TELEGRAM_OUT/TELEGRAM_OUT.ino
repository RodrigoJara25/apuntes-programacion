#include <WiFi.h>
#include <WiFiClientSecure.h>
#include <UniversalTelegramBot.h>
// Reemplazar con los datos de tu red wifi
#define WIFI_SSID "iPhone de Rodrigo"
#define WIFI_PASSWORD "12345678"
//Token de Telegram BOT se obtenienen desde Botfather en telegram
#define BOT_TOKEN "7296144164:AAFwRAQjXKlVXP49Kgct56AcnW7-YEa-eg8"
const unsigned long tiempo = 1000; //tiempo medio entre mensajes de escaneo
WiFiClientSecure secured_client;
UniversalTelegramBot bot(BOT_TOKEN, secured_client);
unsigned long tiempoAnterior; //última vez que se realizó el análisis de mensajes
const int led12 = 2;
const int led14 = 4;
int estadoLed12 = 0;
int estadoLed14 = 0;
int inicio = 1;
String chat_id;
#define ID_Chat "1968250737"//ID_Chat se obtiene de telegram
void mensajesNuevos(int numerosMensajes)
{
  for (int i = 0; i < numerosMensajes; i++)
  {
    String chat_id = bot.messages[i].chat_id;
    String text = bot.messages[i].text;
//////////Luz 1 en el pin 12//////
    if (text == "Luz1on")
    {
      digitalWrite(led12, HIGH); // 
      estadoLed12 = 1;
      bot.sendMessage(chat_id, "Luz 1 encendida", "");
    }

    if (text == "Luz1off")
    {
      estadoLed12 = 0;
      digitalWrite(led12, LOW); // 
      bot.sendMessage(chat_id, "Luz 1 apagada", "");
    }
//////////Luz 2 en el pin 14//////
    if (text == "Luz2on")
    {
      digitalWrite(led14, HIGH); 
      estadoLed14 = 1;
      bot.sendMessage(chat_id, "Luz 2 encendida", "");
    }

    if (text == "Luz2off")
    {
      estadoLed14 = 0;
      digitalWrite(led14, LOW); 
      bot.sendMessage(chat_id, "Luz 2 apagada", "");
    }  

////////Estado de las luces  ///////     

    if (text == "Estado")
    {
      ////Estado luz 1////
      if (estadoLed12)
      {
        bot.sendMessage(chat_id, "Luz 1 encendida", "");
      }
      else
      {
        bot.sendMessage(chat_id, "Luz 1 apagada", "");
      }
      ////Estado luz 2////
      if (estadoLed14)
      {
        bot.sendMessage(chat_id, "Luz 2 encendida", "");
      }
      else
      {
        bot.sendMessage(chat_id, "Luz 2 apagada", "");
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
      ayuda += "Ayuda: Imprime este menú \n";
      ayuda += "Recuerda el sistema distingue entre mayuculas y minusculas \n";
      bot.sendMessage(chat_id, ayuda, "");
    }
    
  }
}

void setup()
{
  Serial.begin(115200);
  pinMode(led12, OUTPUT); //inicializar  pin 12 digital como salida.
  pinMode(led14, OUTPUT); //inicializar pin 14 digital como salida.
  digitalWrite(led12, HIGH); //
  digitalWrite(led14, HIGH);
  // Intenta conectarse a la red wifi
  Serial.print("Conectando a la red ");
  Serial.print(WIFI_SSID);
  WiFi.begin(WIFI_SSID, WIFI_PASSWORD);
  secured_client.setCACert(TELEGRAM_CERTIFICATE_ROOT); //Agregar certificado raíz para api.telegram.org
  while (WiFi.status() != WL_CONNECTED)
  {
    Serial.print(".");
    delay(500);
  }
  Serial.print("\nConectado a la red wifi. Dirección IP: ");
  Serial.println(WiFi.localIP());
   if(inicio == 1){
    Serial.println("Sistema preparado");
    bot.sendMessage(ID_Chat, "Sistema preparado!!!, escribe Ayuda para ver las opciones", "");//Enviamos un mensaje a telegram para informar que el sistema está listo
    inicio = 0;
    }
}

void loop()
{
  //Verifica si hay datos nuevos en telegram cada 1 segundo
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
  
}
