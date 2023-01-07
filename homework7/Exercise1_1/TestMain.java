package Exercise1_1;
public class TestMain {
    public static void main(String[] args) {
        Shape shape1 = new Circle(5.5, "red", false);
        System.out.println(shape1);
        System.out.println(shape1.getArea());
        System.out.println(shape1.getPerimeter());
        System.out.println(shape1.getColor());
        System.out.println(shape1.isFilled());
        System.out.println(((Circle) shape1).getRadius());

        Circle circle1 = (Circle) shape1;
        System.out.println(circle1);
        System.out.println(circle1.getArea());
        System.out.println(circle1.getPerimeter());
        System.out.println(circle1.getColor());
        System.out.println(circle1.isFilled());
        System.out.println(circle1.getRadius());

        //Shape shape2 = new Shape(); bao sai

        Shape shape3 = new Retangle("red", false, 1.0, 2.0);
        System.out.println(shape3);
        System.out.println(shape3.getArea());
        System.out.println(shape3.getPerimeter());
        System.out.println(shape3.getColor());
        System.out.println(((Retangle) shape3).getLength());

        Shape shape4 = new Square(6.6);
        System.out.println(shape4);
        System.out.println(shape4.getArea());
        System.out.println(shape4.getColor());
        System.out.println(((Square) shape4).getSide());

        Retangle retangle2 = (Retangle) shape4;
        System.out.println(retangle2);
        System.out.println(retangle2.getArea());
        System.out.println(retangle2.getColor());
        System.out.println(((Square) retangle2).getSide());
        System.out.println(retangle2.getLength());

        Square square1 = (Square) retangle2;
        System.out.println(square1);
        System.out.println(square1.getArea());
        System.out.println(square1.getColor());
        System.out.println(square1.getSide());
        System.out.println(square1.getLength());

    }
}
