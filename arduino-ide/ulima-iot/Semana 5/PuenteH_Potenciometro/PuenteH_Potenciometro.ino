int in1 = 23;
int in2 = 22;
int ena = 19;

int pot = 35;
int volt;
int pwm;

void setup() {
  // put your setup code here, to run once:
  Serial.begin(115200);
  pinMode(in1, OUTPUT);
  pinMode(in2, OUTPUT);
  pinMode(ena, OUTPUT);
  pinMode(pot, INPUT);
}

void loop() {
  volt = analogRead(pot);
  Serial.println(volt);
  digitalWrite(ena, HIGH);
  digitalWrite(in1, HIGH);
  digitalWrite(in2, LOW);
}
