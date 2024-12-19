#include <WiFi.h>
#include "Adafruit_MQTT.h"
#include "Adafruit_MQTT_Client.h"

/*************************Variables de las entradas y salidas***********************************/
const int ledPin = 4;
const int freq = 5000;
const int ledChannel = 0;
const int resolution = 8;

char charPulsador [15];
String strPulsador;
String strPulsadorUltimo;

/********************Parametros de conexion Wifi*******************************/
#define WLAN_SSID       "iPhone de Rodrigo"  // Ingresa el nombre de tu red        
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

// Configuracion para publicar los feeds del servidor MQTT
Adafruit_MQTT_Publish temperatura = Adafruit_MQTT_Publish(&mqtt, IO_USERNAME"/feeds/Analogico");
Adafruit_MQTT_Publish entrada = Adafruit_MQTT_Publish(&mqtt, IO_USERNAME"/feeds/digin");


// Configuracion para leer los feeds del servidor MQTT
Adafruit_MQTT_Subscribe onoff = Adafruit_MQTT_Subscribe(&mqtt, IO_USERNAME "/feeds/encender");
Adafruit_MQTT_Subscribe pwm = Adafruit_MQTT_Subscribe(&mqtt, IO_USERNAME "/feeds/slide");


/*********************Subrutinas para escritura digital y PWM*************************************/
void digitalCallback(char *data, uint16_t len) {
  Serial.print("Hey we're in a onoff callback, the button value is: ");
  Serial.println(data);

     String message = String(data);
      message.trim();
      if (message == "ON") {digitalWrite(2, HIGH);}
      if (message == "OFF") {digitalWrite(2, LOW);}
}

void analogicaCallback(char *data, uint16_t len) {
  Serial.print("Hey we're in a pwm callback, the value is: ");
  Serial.println(data);

     String message = String(data);
     message.trim();
     ledcWrite(ledChannel, message.toInt());
}

/*********************Setup*************************************/
void setup()
{
  pinMode(32,INPUT);//entrada analógica
  pinMode(23,INPUT);//entrada boton
  pinMode(2,OUTPUT);//salida led 1:led interno
  /*pwm*/
  ledcSetup(ledChannel, freq, resolution);
  ledcAttachPin(ledPin, ledChannel);
  Serial.begin(115200);
  delay(10);

/*************************Conexión a la red wifi**************************/
Serial.println();
Serial.print("Connecting to ");
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
onoff.setCallback(digitalCallback);
mqtt.subscribe(&onoff);
pwm.setCallback(analogicaCallback);
mqtt.subscribe(&pwm);
}

/**********************************LOOP*************************************/
void loop()
{
//Conección al servidor MQTT
MQTT_connect();

//*********Lectura y publición el valor del sensor analógico
float tem = analogRead(32); //Se lee la temperatura
Serial.print(F("\n Lectura"));
Serial.print(tem);
Serial.print("...");
if (! temperatura.publish(tem)) {
Serial.println(F("Failed"));
} else {
Serial.println(F("OK!"));
}


//*********Lectura de una entrada digital (pulsador)
if (digitalRead(23) == 1) {
    strPulsador = "presionado";
    Serial.println("si");
  } else {
    strPulsador = "NO presionado";
    Serial.println("no");
  }

//*******Publicación de la entrada digital
if (strPulsador != strPulsadorUltimo) { //envia el estado del pulsador solamente cuando cambia.
    strPulsadorUltimo = strPulsador;
    strPulsador.toCharArray(charPulsador, 15);
    Serial.print(F("\nSending pulsador val "));
    Serial.print(strPulsador);
    Serial.print("...");
    if (! entrada.publish(charPulsador)) {
      Serial.println(F("Failed"));
    } else {
      Serial.println(F("OK!"));
    }
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