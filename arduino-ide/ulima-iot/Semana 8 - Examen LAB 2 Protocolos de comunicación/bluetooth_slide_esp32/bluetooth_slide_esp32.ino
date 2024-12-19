#include "BluetoothSerial.h"

// Check if Bluetooth configs are enabled
#if !defined(CONFIG_BT_ENABLED) || !defined(CONFIG_BLUEDROID_ENABLED)
#error Bluetooth is not enabled! Please run `make menuconfig` to and enable it
#endif

// Bluetooth Serial object
BluetoothSerial SerialBT;

// GPIOs where LEDs are connected to
const int ledPin1 = 19;
const int ledPin2 = 18;
const int ledPin3 = 5;

// Handle received and sent messages
int pwm1 = 0;
int pwm2 = 0;
int pwm3 = 0;

// Setting PWM properties
const int freq = 5000;
const int resolution = 8;

void setup() {
  pinMode(ledPin1, OUTPUT);
  pinMode(ledPin2, OUTPUT);
  pinMode(ledPin3, OUTPUT);
  
  ledcSetup(0, freq, resolution);
  ledcSetup(1, freq, resolution);
  ledcSetup(2, freq, resolution);
  
  ledcAttachPin(ledPin1, 0);
  ledcAttachPin(ledPin2, 1);
  ledcAttachPin(ledPin3, 2);
  
  Serial.begin(115200);
  // Bluetooth device name
  SerialBT.begin("ESP32");
  Serial.println("The device started, now you can pair it with Bluetooth!");
}

void loop() {
  // Check for incoming data from Bluetooth
  while (SerialBT.available() > 0) {
    // Read the first integer value and store it in the variable
    pwm1 = SerialBT.parseInt();
    // Read the second integer value and store it in the variable
    pwm2 = SerialBT.parseInt();
    // Read the third integer value and store it in the variable
    pwm3 = SerialBT.parseInt();
    
    // When it reads the character 'R', it means that the transmission of values has finished
    if (SerialBT.read() == 'R') {
      // Send the received PWM values to the respective LEDs through PWM
      ledcWrite(0, pwm1);
      ledcWrite(1, pwm2);
      ledcWrite(2, pwm3);
      
      // Clear the input buffer
      while (SerialBT.available() > 0) {
        SerialBT.read();
      }
    }
  } 
  delay(20);
}
