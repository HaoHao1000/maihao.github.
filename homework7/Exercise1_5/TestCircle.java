package Exercise1_5;

public class TestCircle {
    public static void main(String[] args) {
        GeometricObject c1 = new Circle(26);
        System.out.println(c1);
        System.out.println("Perimeter = " + c1.getPerimeter());
        System.out.println("Area = " + c1.getArea());
    }
}
