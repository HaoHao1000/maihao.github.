package Exercise1_1;

public class Retangle extends Shape{
    protected double width = 1.0;
    protected double length = 1.0;

    public Retangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Retangle(String color, Boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public Retangle(){

    }
    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    double getArea() {
        return width * length;
    }

    @Override
    double getPerimeter() {
        return 2*(width+length);
    }

    @Override
    public String toString() {
        return "Retangle[Shape[" +
                "color=" + color +
                ", filled=" + filled +
                "], width='" + width +
                ", length=" + length +
                ']';
    }
}
