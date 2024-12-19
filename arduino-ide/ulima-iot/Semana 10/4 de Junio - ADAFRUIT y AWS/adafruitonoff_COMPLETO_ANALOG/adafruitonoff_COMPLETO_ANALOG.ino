#include <WiFi.h> 
#include "Adafruit_MQTT.h"
#include "Adafruit_MQTT_Client.h"

/*************************Variables de las entradas y salidas***********************************/
const int led = 2;
int analogico = 35;  //potenciometro

/********************Parametros de conexion Wifi*******************************/
#define WLAN_SSID       "Andrew"  // Ingresa el nombre de tu red         
#define WLAN_PASS       "12345678"  // Ingresa la contraseña de tu red 
/************************* Adafruit.io Setup *********************************/
#define AIO_SERVER "io.adafruit.com"
#define AIO_SERVERPORT 1883 
#define IO_USERNAME  "RodrigoJ"
#define IO_KEY       "aio_JHIE507avSxK4R42poRZP4Dz11Lm"

/************ Configuración del servidor MQTT *********************/
// Crea una clase WiFiClient para conectarse al servidor MQTT
WiFiClient client;
// Configuración cliente MQTT pasando, cliente WiFi y servidor MQTT y los detalles de inicio de sesión.
Adafruit_MQTT_Client mqtt(&client, AIO_SERVER, AIO_SERVERPORT, IO_USERNAME, IO_KEY);

/***************** Feeds que se definieron en Adafruit IO *******************/
//Configuracion para publicar los feeds del servidor MQTT
Adafruit_MQTT_Publish valanalog = Adafruit_MQTT_Publish(&mqtt, IO_USERNAME"/feeds/Analog");

// Configuracion para leer los feeds del servidor MQTT
Adafruit_MQTT_Subscribe encendido = Adafruit_MQTT_Subscribe(&mqtt, IO_USERNAME "/feeds/onoff20241");


/*********************Subrutinas para escritura digital y PWM*************************************/
void digitalCallback(char *data, uint16_t len) {
  Serial.print("Activamos la llamada de retorno digital, el boton se encuentra: ");
  Serial.println(data);

     String message = String(data);
      message.trim();
      if (message == "ON") {digitalWrite(led, HIGH);}
      if (message == "OFF") {digitalWrite(led, LOW);} 
}



/*********************Setup*************************************/
void setup()
{

  pinMode(led,OUTPUT);//salida led 1:led interno
  pinMode(analogico, INPUT);
  Serial.begin(115200);
  delay(10);

/*************************Conexión a la red wifi**************************/
Serial.println();
Serial.print("Conectando a la red ");
Serial.println(WLAN_SSID);

WiFi.begin(WLAN_SSID, WLAN_PASS);
while (WiFi.status() != WL_CONNECTED) {
delay(500);
Serial.print(".");
}
Serial.println();
Serial.println("WiFi conectado");
Serial.println("IP address: "); 
Serial.println(WiFi.localIP());

/*************************Llamado a subrutinas de escrituras**************************/
encendido.setCallback(digitalCallback);
mqtt.subscribe(&encendido);

}

/**********************************LOOP*************************************/
void loop()
{

//Conección al servidor MQTT
MQTT_connect();

  float volt = analogRead(analogico);

if (!valanalog.publish(volt)){
  Serial.println(F("Failed"));
}else{
  Serial.println(F("OK!"));
}

//Espero 1 segundo para terminar de procesar todas las lecturas de los feeds del servidor MQTT
mqtt.processPackets(1000);

//Espero 2,5 segundos para evitar la sobresaturación del servidor gratuito MQTT
delay(2500);
}


/*************************************************/
// Subrutina para conectar al servidor MQTT
void MQTT_connect() {
int8_t ret;
// Detener si ya está conectado
if (mqtt.connected()) {
return;
}

Serial.print("Conectando a MQTT... ");
uint8_t retries = 3;
while ((ret = mqtt.connect()) != 0) { // connect devolverá 0 para conectado
Serial.println(mqtt.connectErrorString(ret));
Serial.println("Re-intentando la conexión MQTT en 5 segundos...");
mqtt.disconnect();
delay(5000); // espera 5 segundos
retries--;
if (retries == 0) {
// La conexión falla y espera a que se reinicie
while (1);
}
}
Serial.println("MQTT Conectado!"); 
}
