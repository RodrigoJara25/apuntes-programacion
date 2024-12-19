//Código para convertir el ESP32 en un Acces Point

#include <WiFi.h>

// Nombre y contraseña de la red
const char* ssid     = "SSID";  //Cambiar y crear el nombre de la red
const char* password = "PASSWORD";  //Crear contraseña para el ESP32 (min 8 caracteres)

// Definimos el puerto 80 del webserver
WiFiServer server(80);

// Variable para almacenar la solicitud HTTP
String header;




void setup() {
  Serial.begin(115200);
  // Conectando el AP con el SSID y contraseña
  Serial.println("Configurando AP (Access Point)…");
  delay(500);
  WiFi.softAP(ssid,password);
  IPAddress IP = WiFi.softAPIP();
  Serial.print("AP IP address: ");
  Serial.println(IP);
  
  server.begin();
}

void loop(){
}
