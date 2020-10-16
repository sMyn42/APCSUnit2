package base.geometry;

public class Circle {
    private double radius;

    public Circle(double r){
        radius = r;
    }

    public Circle(){
        //Default r = 1.0
        radius = 1.0;
    }

    public double area(){
        return Math.PI * this.radius * this.radius;
    }

    public double circumference(){
        return Math.PI * this.radius * 2;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double r){
        radius = r;
    }
}
