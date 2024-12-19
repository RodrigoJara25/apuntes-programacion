//Conectarnos como modo Estación y encender un LED

#include <WiFi.h>
#include <WebServer.h>

// Nombre y contraseña de la red
const char* ssid     = "iPhone de Rodrigo";  //Usuario ya existente
const char* password = "12345678";  //Contraseña del usuario ya existente

WiFiServer server(80);
// Variable para almacenar la solicitud HTTP
String header;

// Variables auxiliares para almacenar el estado de salida actual
String estadosalida2 = "off";
String estadosalida22 = "off";

// asignamos los puertos de salida
int output2 = 2;
int output22 = 27;

int analog = 35;
int valor;

// Definición de tiempos para conectar a la red WiFi
unsigned long currentTime = millis();
unsigned long previousTime = 0;
const long timeoutTime = 2000;

void setup() {
  Serial.begin(115200);
  pinMode(output2,OUTPUT);
  pinMode(output22,OUTPUT);
  pinMode(analog, INPUT);
  digitalWrite(output2, LOW);
  digitalWrite(output22, LOW);
 
  // Conectando el ESP32 con el SSID y contraseña
   Serial.print("Conectando a la red ");
  Serial.println(ssid);
  WiFi.begin(ssid, password);
  while (WiFi.status() != WL_CONNECTED) {
    delay(500);
    Serial.print(".");
  }
 
  Serial.println("");
  Serial.println("WiFi connected.");
  Serial.println("IP address: ");
  Serial.println(WiFi.localIP());
  server.begin();
}

void loop(){

  valor = analogRead(analog);
 
  WiFiClient client = server.available();   // Esperando la entrada de nuevos clientes

  if (client) {
    currentTime = millis();
    previousTime = currentTime;                            
    Serial.println("Nuevo usuario");        
    String currentLine = "";              
    while (client.connected() && currentTime - previousTime <= timeoutTime) {    //loop de enlace con el cliente        
      currentTime = millis();
      if (client.available()) {            
        char c = client.read();            
        Serial.write(c);                    
        header += c;
        if (c == '\n') {                    //si termina el mensaje o empieza una nueva línea
          if (currentLine.length() == 0) {  //en caso que no llegue ni un solo valor
            client.println("HTTP/1.1 200 OK");
            client.println("Content-type:text/html");
            client.println("Connection: close");
            client.println();
           
            // encender y apagar los leds 2 y 27
            if (header.indexOf("GET /2/on") >= 0) {
              Serial.println("GPIO 2 on");
              estadosalida2 = "on";
              digitalWrite(output2, HIGH);
            }
            else if (header.indexOf("GET /2/off") >= 0) {
              Serial.println("GPIO 2 off");
              estadosalida2 = "off";
              digitalWrite(output2, LOW);
            }

            if (header.indexOf("GET /1/on") >= 0) {
              Serial.println("GPIO 1 on");
              estadosalida22 = "on";
              digitalWrite(output22, HIGH);
            }
            else if (header.indexOf("GET /1/off") >= 0) {
              Serial.println("GPIO 1 off");
              estadosalida22 = "off";
              digitalWrite(output22, LOW);
            }
           
           
            // WEB en HTML
            client.println("<!DOCTYPE html><html>");
            client.println("<head><meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">");
            client.println("<link rel=\"icon\" href=\"data:,\">");
            // CSS del estilo de los botones on/off  
            client.println("<style>html { font-family: Helvetica; display: inline-block; margin: 0px auto; text-align: center;}");
            client.println(".button { background-color: #4CAF50; border: none; color: white; padding: 16px 40px;");
            client.println("text-decoration: none; font-size: 30px; margin: 2px; cursor: pointer;}");
            client.println(".button2 {background-color: #555555;}</style></head>");

           
           
            // Encabezado de la página web
            //client.println("<body><h1>ESP32 como STA</h1>");
            client.println("<body style='background-color: red;'><h1>ESP32 como STA</h1>");

           
            // Mostrar el estado actual del led y el boton ON/OFF de la salida 2
            client.println("<p>GPIO 2 - esta " + estadosalida2 + "</p>");
            if (estadosalida2=="off") {
              client.println("<p><a href=\"/2/on\"><button class=\"button\">ON</button></a></p>");            
            } else {
              client.println("<p><a href=\"/2/off\"><button class=\"button button2\">OFF</button></a></p>");
            }

            // Mostrar el estado actual del led y el boton ON/OFF de la salida 2
            client.println("<p>GPIO 1 - esta " + estadosalida22 + "</p>");
            if (estadosalida22=="off") {
              client.println("<p><a href=\"/1/on\"><button class=\"button\">ON</button></a></p>");            
            } else {
              client.println("<p><a href=\"/1/off\"><button class=\"button button2\">OFF</button></a></p>");
            }

       
            client.println("<p>PRUEBA MEDIDAS</p>");
            client.println("Valor analogico");
            client.println(valor);
               
           
            client.println("</body></html>");
           
            // Implimimos una línea en blanco para finalizar la respuesta HTTP
            client.println();
            // salimos del bucle while de conexion del cliente
            break;
            //borramos la línea usada
          } else {
            currentLine = "";    
          }
        } else if (c != '\r') {  
          currentLine += c;      
        }
      }
    }
    // Borramos la variable header
    header = "";
    // Cerramos la conexión
    client.stop();
    Serial.println("Cliente desconectado");
    Serial.println("");
  }
}
