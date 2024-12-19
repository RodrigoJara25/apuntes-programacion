// Proyecto Integrador

#include<LiquidCrystal_I2C.h> //import una libreria para el LCD
#include <Servo.h>

LiquidCrystal_I2C lcd(0x27,16,2);

Servo puerta1; //declaro el Servo con el nombre de puerta1
Servo puerta2;
Servo puerta3;

int led1 = 13; //asigno nombre a los pines
int led2 = 12;
int led3 = 4;

int pir = 7; //sensor
int pirdato; //recibe el dato que obtenga el sensor

int i;

int buzzer = 8; // El pin al que está conectado el zumbador

int llamada1 = 9;
int llamada2 = 6;
int llamada3 = 10;

int botonDesactivar = 11; // Modifica el número del pin según tu conexión

void setup()
{
  pinMode(led1, OUTPUT);
  pinMode(led2, OUTPUT);
  pinMode(led3, OUTPUT);
  
  pinMode(pir, INPUT);
  
  pinMode(buzzer, OUTPUT);
  
  //Inicio el sistema y muestro mensaje 
  lcd.init();
  lcd.backlight();
  lcd.setCursor(4,0);
  lcd.print("SISTEMA");
  lcd.setCursor(4,1);
  lcd.print("ACTIVADO");
  delay(2000);
  
  puerta1.attach(2);
  puerta2.attach(3);
  puerta3.attach(5);
  
  pinMode(llamada1, OUTPUT);
  pinMode(llamada2, OUTPUT);
  pinMode(llamada3, OUTPUT);
  
  //Establezco los Servo a 0° como posición inical
  puerta1.write(0);  //de 0 a 180
  puerta2.write(0);  //de 0 a 180
  puerta3.write(0);  //de 0 a 180
  
  pinMode(botonDesactivar, INPUT);
}

void loop()
{
  //Mostrar "Nada sospechoso" en el LCD mientras no se detecta movimeinto
  lcd.clear();
  lcd.setCursor(0,0);
  lcd.print("NADA");
  lcd.setCursor(0,1);
  lcd.print("SOSPECHOSO");
  
  pirdato = digitalRead(pir); //recibe el dato del pin 7
  if(pirdato == HIGH) //Si el sensor detecta movimiento
  { 
    lcd.clear(); //Emite mensaje "Instruso detectado"
    lcd.setCursor(0,0);
    lcd.print("INTRUSO");
    lcd.setCursor(0,1);
    lcd.print("DETECTADO");
    delay(2000);
    
    lcd.clear(); //Luego de 2 segundos, muestra "Prendiendo luces"
    lcd.setCursor(0,0);
    lcd.print("PRENDIENDO");
    lcd.setCursor(0,1);
    lcd.print("LUCES...");
    for (i=0; i<255; i++) //Se prenden las luces progresivamente
    { 
      analogWrite(led1,i);
      analogWrite(led2,i);
      analogWrite(led3,i);
      delay(10);
    }
    
    lcd.clear(); //Luego muestra "Activando alarma"
    lcd.setCursor(0,0);
    lcd.print("ACTIVANDO");
    lcd.setCursor(0,1);
    lcd.print("ALARMA");
    delay(2000); //Luego de 2 segundos, se activa la alarma
    activarAlarma();
    lcd.clear();
    lcd.setCursor(0,0);
    lcd.print("ALARMA"); //Se muestra "Alarma activada"
    lcd.setCursor(0,1);
    lcd.print("ACTIVADA");
    delay(2000);
    
    lcd.clear(); //Luego de 2 segundos, se muestra "Cerrando puertas"
    lcd.setCursor(0,0);
    lcd.print("CERRANDO");
    lcd.setCursor(0,1);
    lcd.print("PUERTAS...");
    delay(2000);
    puerta1.write(180);  //Se giran los Servo en 180°
    puerta2.write(180);  
    puerta3.write(180); 
    lcd.clear();
    lcd.setCursor(0,0);
    lcd.print("PUERTAS"); //Se muestra "Puertas cerradas"
    lcd.setCursor(0,1);
    lcd.print("CERRADAS");
    delay(2000);
    
    lcd.clear();
    lcd.setCursor(0,0);
    lcd.print("LLAMANDO A LAS");  //Luego de 2 segundos, se muestra "Llamando a las autoridades"
    lcd.setCursor(0,1);
    lcd.print("AUTORIDADES...");
    delay(2000); 
    while(digitalRead(botonDesactivar) == LOW) //Y parpadean los LEDs hasta que se presiones el botón
    {
      parpadearLEDs();
    }
    //Si el botón está activado, entonces se desactiva el sistema
    if (digitalRead(botonDesactivar) == HIGH) 
    {
      desactivarSistema();
    }
  }
  delay(1000);
}

void activarAlarma() 
{
  tone(buzzer, 500); // Frecuencia de 500 Hz
}

void desactivarAlarma() 
{
  noTone(buzzer);
}

void parpadearLEDs() 
{
  //unsigned long startTime = millis();
  //millis() - startTime < 60000 - 1 minuto de parpadeo
    digitalWrite(llamada1, HIGH);
    digitalWrite(llamada2, HIGH);
    digitalWrite(llamada3, HIGH);
    delay(500);
    digitalWrite(llamada1, LOW);
    digitalWrite(llamada2, LOW);
    digitalWrite(llamada3, LOW);
    delay(500);
}
void desactivarLEDs()
{
  digitalWrite(llamada1, LOW);
  digitalWrite(llamada2, LOW);
  digitalWrite(llamada3, LOW);
}

void desactivarSistema() 
{
  lcd.clear();
  lcd.setCursor(0, 0);
  lcd.print("DESACTIVANDO");
  lcd.setCursor(0, 1);
  lcd.print("SISTEMA...");
  delay(2000);

  // Desactivar todos los componentes
  desactivarAlarma();
  digitalWrite(led1, LOW);
  digitalWrite(led2, LOW);
  digitalWrite(led3, LOW);
  puerta1.write(0);  // Abrir puertas
  puerta2.write(0);
  puerta3.write(0);
  desactivarLEDs();

  // Esperar un tiempo antes de volver al loop principal
  delay(2000);
}
  