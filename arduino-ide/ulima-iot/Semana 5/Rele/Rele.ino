int rele = 23;

void setup() {
  // put your setup code here, to run once:
  Serial.begin(115200);
  Serial.println("Hello, ESP32!");
  pinMode(rele, OUTPUT);
}

void loop() {
  delay(10); // this speeds up the simulation
  digitalWrite(rele, HIGH);
  delay(3000);
  digitalWrite(rele, LOW);
  delay(3000);
}
