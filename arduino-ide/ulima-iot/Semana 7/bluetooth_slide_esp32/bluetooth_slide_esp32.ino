#include "BluetoothSerial.h"

// Check if Bluetooth configs are enabled
#if !defined(CONFIG_BT_ENABLED) || !defined(CONFIG_BLUEDROID_ENABLED)
#error Bluetooth is not enabled! Please run `make menuconfig` to and enable it
#endif

// Bluetooth Serial object
BluetoothSerial SerialBT;

// GPIO where LED is connected to
const int ledPin =  19;
const int ledPin2 = 23;
const int ledPin3 = 22;

// Handle received and sent messages
int pwm=0;
int pwm2 = 0;
int pwm3 = 0;

// setting PWM properties
const int freq = 5000;
const int ledChannel = 0;
const int ledChannel2 = 1;
const int ledChannel3 = 2;
const int resolution = 8;

void setup() {
  pinMode(ledPin, OUTPUT);
  pinMode(ledPin2, OUTPUT);
  pinMode(ledPin3, OUTPUT);
  ledcSetup(ledChannel, freq, resolution);
  ledcSetup(ledChannel2, freq, resolution);
  ledcSetup(ledChannel3, freq, resolution);
  ledcAttachPin(ledPin, ledChannel);
  ledcAttachPin(ledPin2, ledChannel);
  ledcAttachPin(ledPin3, ledChannel);
  Serial.begin(115200);
  // Bluetooth device name
  SerialBT.begin("ESP32");
  Serial.println("The device started, now you can pair it with bluetooth!");
}

void loop() {

while (SerialBT.available()>0)
    {
        pwm = SerialBT.parseInt(); //Leemos el primer valor entero y 
                                   //  lo almacenamos en la variable
        pwm2 = SerialBT.parseInt();
        pwm3 = SerialBT.parseInt();
        //Cuando lea el carácter R quiere decir que ha finalizado 
        //  el envío de los valores
        if (SerialBT.read() == 'R')
        {
          //Enviamos los valores de los tres colores al LED RGB através de PWM
          ledcWrite(ledChannel, pwm);
          //analogWrite(ledPin,pwm);
          ledcWrite(ledChannel2, pwm);
          ledcWrite(ledChannel3, pwm);
        }
  } 
  delay(20);
}
