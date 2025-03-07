int in1 = 23;
int in2 = 22;
int ena = 19;

int pot = 35;
int volt;
int pwm;

int freq = 5000;
int ledChannel = 0;
int resolution = 8;

void setup() {
  // put your setup code here, to run once:
  Serial.begin(115200);
  Serial.println("Hello, ESP32!");
  pinMode(in1, OUTPUT);
  pinMode(in2, OUTPUT);
  //pinMode(ena, OUTPUT);
  pinMode(pot, INPUT);
  ledcSetup(ledChannel, freq, resolution);
  ledcAttachPin(ena, ledChannel);
}

void loop() {
  volt = analogRead(pot);
  Serial.println(volt);
  pwm = map(volt, 0, 4095, 0, 255);
  ledcWrite(ledChannel, pwm);
  //digitalWrite(ena, HIGH);
  digitalWrite(in1, HIGH);
  digitalWrite(in2, LOW);
}