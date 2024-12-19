#include <WiFi.h>
#include <WiFiClientSecure.h>
#include <UniversalTelegramBot.h>

// Reemplazar con los datos de tu red wifi
const char* ssid = "iPhone de Rodrigo";
const char* password = "12345678";

//Reemplazar con los datos del telegram
#define token_Bot "7296144164:AAFwRAQjXKlVXP49Kgct56AcnW7-YEa-eg8" //Token de Telegram BOT se obtenienen desde Botfather en telegram
#define ID_Chat "1968250737" //El ID se obtiene de (IDBot) en telegram no olvidar hacer click en iniciar

WiFiClientSecure secured_client;
UniversalTelegramBot bot(token_Bot, secured_client);

void setup() {
  // put your setup code here, to run once:
  Serial.begin(115200);
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
  bot.sendMessage(ID_Chat, "Sistema preparado para usar telegram!", "");//Enviamos un mensaje a telegram para informar que el sistema está listo
}


void loop() {
  // put your main code here, to run repeatedly:

}
