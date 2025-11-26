#include <ESP32Servo.h>

#define SERVO_PIN 13
#define IR_PIN 14

Servo getServo;

int openPos = 90;
int closePos = 0;

void setup() {
  Serial.begin(115200);

  pinMode(IR_PIN, INPUT);

  getServo.attach(SERVO_PIN);
  getServo.write(closePos);

  Serial.println("Smart Feeder Ready!");

}

void feed() {
  Serial.println("Feeding...");
  getServo.write(openPos);
  delay(1000);
  getServo.write(closePos);
  Serial.println("Done Feeding");
}

void loop() {
  int irValue = digitalRead(IR_PIN);

  if (irValue == HIGH){
    Serial.println("Mangkuk kosong! Memberi pakan...");

    feed();

    delay(2000);
  } else {
    Serial.println("Makanan masih ada");
  }

  delay(500);
}
