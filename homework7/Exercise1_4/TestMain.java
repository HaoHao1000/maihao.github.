package Exercise1_4;

public class TestMain {
    public static void main(String[] args) {
        Movable m1 = new MovablePoint(2, 6, 3, 3);
        System.out.println(m1.toString());
        m1.moveUp();
        System.out.println(m1.toString());
        System.out.println();

        Movable m2 = new MovableCircle(2, 6, 3, 11, 12);
        System.out.println(m2.toString());
        m2.moveDown();
        System.out.println(m2.toString());
        System.out.println();

    }
}
