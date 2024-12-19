#include <WiFi.h>
#include <WiFiClientSecure.h>
#include <UniversalTelegramBot.h>
//#include <ArduinoJson.h>
// Reemplazar con los datos de tu red wifi
const char* ssid = "iPhone de Rodrigo";
const char* password = "12345678";
//Token de Telegram BOT se obtenienen desde Botfather en telegram
#define token_Bot "7296144164:AAFwRAQjXKlVXP49Kgct56AcnW7-YEa-eg8"
// El ID se obtiene de (IDBot) en telegram no olvidar hacer click en iniciar
#define ID_Chat "1968250737"
WiFiClientSecure secured_client;
UniversalTelegramBot bot(token_Bot, secured_client);
const int pulsador = 23; // Pin donde está conectada la entrada del sensor PIR
const int luz = 4;// Pin para luz de 110 o 220 V( Con módulo relay)
int conteo = 0;
String mensaje = "";
String conteoString = "";
int PIR = 0;
////Setup////
void setup() {
  Serial.begin(115200);
  // Activamos el resistor de PULLUP para la entrada sensor PIR
  pinMode(pulsador, INPUT_PULLUP);
  pinMode(luz, OUTPUT);
  // Intenta conectarse a la red Wifi:
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
  bot.sendMessage(ID_Chat, "Sistema preparado de envio basico!!!", "");//Enviamos un mensaje a telegram para informar que el sistema está listo
}
/////loop//////
void loop() {
   PIR = digitalRead(pulsador);//Leemos el estado del pulsador
   //Si es igual a "1" se cumple la condición
  if(PIR == 1){
    digitalWrite(luz, HIGH);//Encendemos la luz
    Serial.println("Luz Encendida!");
      conteo = conteo + 1;//Incremento en el contador de movimientos detectados
    conteoString = String(conteo);//Lo convertimos a una cadena
    mensaje = "Movimiento detectados: " + conteoString;//Concatenamos ambas cadenas
    bot.sendMessage(ID_Chat, mensaje, "");//Enviamos el mensaje a Telegram
    delay(5000);//mantensmos la luz encendida este tiempo
    digitalWrite(luz, LOW);//Luego la apagamos
    Serial.println("Luz apagada!");
    PIR = 0;//Asignamos el valor "0" a la variable PIR para que deje de cumplirse la condición
  }
}
