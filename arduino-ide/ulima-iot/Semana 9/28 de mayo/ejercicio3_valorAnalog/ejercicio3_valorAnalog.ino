//Código para prender un LED pero con un valor analogcio como INPUT

#include <WiFi.h>

const char* ssid     = "iPhone de Rodrigo";
const char* password = "12345678";

// Definimos el puerto 80 del webserver
WiFiServer server(80);

// Variable para almacenar la solicitud HTTP
String header;

//Definición de la entrada
int entrada=35;
int valor;

//Variables de tiempo para conexión
unsigned long currentTime = millis();
unsigned long previousTime = 0; 
const long timeoutTime = 2000;

void setup() {
  Serial.begin(115200);
  pinMode(entrada,INPUT);
  bool status;

 
  // Conectando a la red wifi
  Serial.print("Connecting to ");
  Serial.println(ssid);
  WiFi.begin(ssid, password);
  while (WiFi.status() != WL_CONNECTED) {
    delay(500);
    Serial.print(".");
  }
  // Mostrar IP
  Serial.println("");
  Serial.println("WiFi connected.");
  Serial.println("IP address: ");
  Serial.println(WiFi.localIP());
  server.begin();
}

void loop(){
  valor=analogRead(entrada);
  WiFiClient client = server.available();   
  
  if (client) {                             
    currentTime = millis();
    previousTime = currentTime;
    Serial.println("New Client.");          
    String currentLine = "";                
    while (client.connected() && currentTime - previousTime <= timeoutTime) {  
      currentTime = millis();
      if (client.available()) {             
        char c = client.read();             
        Serial.write(c);                    
        header += c;
        if (c == '\n') {                    
          if (currentLine.length() == 0) {
            client.println("HTTP/1.1 200 OK");
            client.println("Content-type:text/html");
            client.println("Connection: close");
            client.println();
            
            // // WEB en HTML
            client.println("<!DOCTYPE html><html>");
            client.println("<head><meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">");
            client.println("<link rel=\"icon\" href=\"data:,\">");
                                    
            // Encabezado y variables HTML
            client.println("</style></head><body><h1>ESP32 entradas</h1>");
            client.println("<p>PRUEBA MEDIDAS</p>");
            client.println("Valor analogico");
            client.println(valor); 
                        
            client.println();
            break;
          } else { 
            currentLine = "";
          }
        } else if (c != '\r') {  
          currentLine += c;      
        }
      }
    }
    header = "";
    client.stop();
    Serial.println("Cliente desconectado.");
    Serial.println("");
  }
}
