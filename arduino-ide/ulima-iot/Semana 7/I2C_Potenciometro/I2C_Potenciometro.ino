#include <LiquidCrystal_I2C.h>

LiquidCrystal_I2C pantalla1(0x27, 16, 2);    //el 0x27 es segun la pantalla que te haya tocado

int pot = 33;
int volt;

void setup(){
  pantalla1.init();
  pantalla1.backlight();
  pantalla1.print("hola");
  delay(1000);
  pantalla1.clear();
  pinMode(pot, INPUT);
}

void loop(){
  volt = analogRead(pot);
  pantalla1.setCursor(0,0);
  pantalla1.print("Valor POT");
  pantalla1.setCursor(0,1);
  pantalla1.print(volt);
  pantalla1.print("   ");
  pantalla1.setCursor(7,1);
  pantalla1.print("volt");
}