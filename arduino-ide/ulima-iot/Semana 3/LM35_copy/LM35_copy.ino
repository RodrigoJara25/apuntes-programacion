int lm35=34;
int volt;
void setup() {
  // put your setup code here, to run once:
  Serial.begin(115200);
  pinMode(lm35,INPUT);
  analogReadResolution(10);//resolucion para obtener 1023
}

void loop() {
  // put your main code here, to run repeatedly:
  volt=analogRead(lm35);
  //Serial.println(volt);
  delay(100);

  float millivolts = (volt / 1023.0) * 5000;
  float celsius = (millivolts / 10)+5.0;
  Serial.println(celsius);
  delay(100);
}
