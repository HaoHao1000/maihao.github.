package Exercise1_5;

public class Circle implements  GeometricObject{
    protected double radius;
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle[" +
                "radious=" + radius +
                ']';
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
    public double getPerimeter(){
        return Math.PI * 2 * radius;
    }
}
