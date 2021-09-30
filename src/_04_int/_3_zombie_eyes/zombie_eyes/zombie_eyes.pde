
void setup() {
PImage face = loadImage("derp.png");
size(500,500);
face.resize(width, height);
image(face, 0, 0);
}
void draw() {
  int eyeGreen = mouseX + 30;
  int eyeRed = mouseX - 10;
  int eyeBlue = mouseY;
  fill(eyeRed, eyeGreen, eyeBlue);
ellipse(190,113, 100,100);
ellipse(358, 90, 100,100);
fill(0, 0, 0);
ellipse(190,113, 50,50);
ellipse(358, 90, 50,50);



}
