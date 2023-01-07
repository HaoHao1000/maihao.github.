package Exercise1_5;

public class TestResizableCircle {
    public static void main(String[] args) {
        Resizable re1 = new ResizableCircle(2.6);
        System.out.println(re1);
        re1.resize(80);
        System.out.println(re1);

        GeometricObject re2 = (GeometricObject) re1;
        System.out.println(re2);
        System.out.println("Perimeter = " + re2.getPerimeter());
        System.out.println("Area = " + re2.getArea());
    }
}
