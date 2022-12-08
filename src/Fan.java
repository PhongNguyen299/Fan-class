public class Fan {
     final int SLOW = 1;
     final int MEDIUM = 2;
     final int FAST = 3;

     int speed = 1;
     boolean on = false;
     private double radius = 5;
     private String color = "blue";

     public int getSpeed(){
         return this.speed;
     }
     public void setSpeed(int speed){
         this.speed = speed;
     }

    public boolean getOn(){
        return this.on;
    }
    public void setOn(boolean on){
        this.on = on;
    }

    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }

    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color = color;
    }

    public String toString(){
         return (!on)? "Fan has speed: "+ speed + "color: " + color + "radius" + radius + "fan is on" :"fan is off";
    };

}
