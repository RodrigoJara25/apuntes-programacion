#include <WiFi.h>
#include <HTTPClient.h>

/********************Parametros de conexion Wifi*******************************/
const char* ssid = "Andrew";   //Nos conectamos a una red
const char* password = "12345678";   //Nos conectamos a una red

/********************URL completo para conseguir un POST en HTTP*******************************/
const char* serverName = "http://api.thingspeak.com/update";
// Service API Key
String apiKey = "PCQLSDGSJZE8P44A"; //CADA UNO CAMBIA DE API KEY

/********************Definición de 10 segundos para no saturar el servidor*******************************/
unsigned long lastTime = 0;
unsigned long timerDelay = 15000;  //15 segundos

/**************************Setup*************************************/
void setup() {
  Serial.begin(115200);

/*************************Conexión a la red wifi**************************/
  WiFi.begin(ssid, password);
  Serial.println();
  Serial.print("Conectando a la red ");
  Serial.println(ssid);
  while(WiFi.status() != WL_CONNECTED) {
    delay(500);
    Serial.print(".");
  }
  Serial.println("");
  //Serial.print("WIFI conectado con la siguiente IP: ");
  //Serial.println(WiFi.localIP()); 
  Serial.println("Cada publicación será cada 15 segundos");
}

void loop() {
  //Enviando una solicitud HTTP cada 10 segundos
  if ((millis() - lastTime) > timerDelay) {
    //Revisando la conección WIFI
    if(WiFi.status()== WL_CONNECTED){
      HTTPClient http;
      
      // Definiendo el dominio HTTP con una URL
      http.begin(serverName);
      
      // Especificar encabezado del contenido
      http.addHeader("Content-Type", "application/x-www-form-urlencoded");
      // Envio de la data, se puede añadir más fields como haga falta
      String httpRequestData = "api_key=" + apiKey + "&field1=" + String(random(40)) + "&field2=" + String(random(20));          
      
      // Creando variable para los diferentes códigos de respuesta HTTP
      int httpResponseCode = http.POST(httpRequestData);
      Serial.print("Codigo de Respuesta HTTP: ");
      Serial.println(httpResponseCode);//Si es 200 significa que se envió la información
      // Finalización de envio
      http.end();
    }
    else {
      Serial.println("WiFi Desconectado");
    }
    lastTime = millis();
  }
}
