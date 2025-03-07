#include "BluetoothSerial.h"

// Check if Bluetooth configs are enabled
#if !defined(CONFIG_BT_ENABLED) || !defined(CONFIG_BLUEDROID_ENABLED)
#error Bluetooth is not enabled! Please run `make menuconfig` to and enable it
#endif

// Definición del bluetooth como puerto serial del esp32
BluetoothSerial SerialBT;

// Configuración de pin del ESP32
const int ledPin =  19; //led interno del ESP32
const int ledPin2 = 23; // segundo LED
const int ledPin3 = 22; // tercer LED

// Variable que guarda la información del bluetooth
int estado=0;

void setup() {
  pinMode(ledPin, OUTPUT);
  pinMode(ledPin2, OUTPUT);
  pinMode(ledPin3, OUTPUT);
  Serial.begin(115200);
  // Nombre del bluetooth
  SerialBT.begin("JARA");
  Serial.println("The device started, now you can pair it with bluetooth!");
}

void loop() {
  //Recepcion de información por el monitor serial Bluetooth
  if (SerialBT.available()){
    estado=SerialBT.read();//guardo la variable de la lectura
    Serial.write(estado);//esta línea puede ser eliminada mas tarde  
  }
  
  // función del encendido y apagado
  if (estado =='1'){
    digitalWrite(ledPin, HIGH);
  }
  if (estado =='2'){
    digitalWrite(ledPin, LOW);
  }
  if (estado =='3'){ // Encender el segundo LED
    digitalWrite(ledPin2, HIGH);
  }
  if (estado =='4'){ // Apagar el segundo LED
    digitalWrite(ledPin2, LOW);
  }
  if (estado =='5'){ // Encender el tercer LED
    digitalWrite(ledPin3, HIGH);
  }
  if (estado =='6'){ // Apagar el tercer LED
    digitalWrite(ledPin3, LOW);
  }
  delay(20);//se puede eliminar el delay
}
