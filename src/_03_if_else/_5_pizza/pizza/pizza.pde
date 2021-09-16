PImage pepperoni;
   PImage mushroom;
   PImage olive;
void setup() {
   size(400,400);
   olive = loadImage("olive.png");
   mushroom = loadImage("mushroom.png");
   pepperoni = loadImage("pepperoni.png");
   olive.resize(50,50);
}
void draw() {
   imageMode(CENTER);
   fill(#F7DD7D);
   noStroke();
   ellipse(200,200, 350,350);
   fill(#DB4433);
   ellipse(200,200, 320,320);
   
   if(mousePressed) {
     image(pepperoni, 200,200);
   image(pepperoni, 139,129);
   image(pepperoni, 251,121);
   image(pepperoni, 115,248);
   image(pepperoni, 211,295);
   image(pepperoni, 283,216);
   image(pepperoni, 138,189);
   image(pepperoni, 238,246);
   image(pepperoni, 211,105);
   image(pepperoni, 304,155);
   image(mushroom, 185,146);
   image(mushroom, 189,268);
   image(mushroom, 263,196);
   image(mushroom, 94,190);
   image(mushroom, 267,110);
   image(mushroom, 287,277);
     image(olive, 162,189);
     image(olive, 248,139);
     image(olive, 239,248);
     image(olive, 127,278);
     image(olive, 159,95);
   }
}
