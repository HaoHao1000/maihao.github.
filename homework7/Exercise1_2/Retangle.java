package Exercise1_2;

public class Retangle implements GeometricObject {
    private double width;

    private double length;

    public Retangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public String toString() {
        return "Retangle[" +
                "width=" + width +
                ", length=" + length +
                ']';
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }

}
