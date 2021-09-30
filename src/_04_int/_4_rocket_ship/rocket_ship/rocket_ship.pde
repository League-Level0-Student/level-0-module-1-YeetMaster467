int x = 400; 
int y = 600; 

void setup() {
    size(800, 800);
    
}

void draw() {
  y -= 2;
    background(0, 0, 40); 
    fill(random(255), 0, 0);
    ellipse(x, y + 130, 90, 90);
    fill(248, 128, 0);
    ellipse(x, y + 115, 70, 70);
    fill(255, 153, 0);
    ellipse(x, y + 95, 35, 35);
    fill(100, 100, 100);
    triangle(x, y + 10, x + 50, y + 100, x - 50, y + 100);
    noStroke();
    fill(#CECECE);
    ellipse(90,100, 150,150);
    fill(#818181);
    ellipse(99,53, 20,20);
    ellipse(53,135, 40,40);
    ellipse(120,105, 70,70);
    
    
    
    if(mousePressed && mouseButton == LEFT){
      x -= 3;
    }
    
    if(mousePressed && mouseButton == RIGHT){
      x += 3;
    }
    

}
