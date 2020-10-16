package base.geometry;

public class Cylinder {
    private Circle base;
    private double height;

    public Cylinder(double r, double h){
        base = new Circle(r);
        height = h;
    }

    public Cylinder(){
        base = new Circle(1.0);
        height = 1.0;
    }

    public double vol(){
        return base.area() * this.height;
    }

    public double sa(){
        return base.circumference() * this.height + 2 * base.area();
    }
}
