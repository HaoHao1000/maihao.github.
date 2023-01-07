package Exercise1_8;

public class TestMain {
    public static void main(String[] args) {
        Movable m1 = new MovablePoint(2, 6, 3 ,3);
        System.out.println(m1);
        m1.moveLeft();
        System.out.println(m1);
        m1.moveRight();
        System.out.println(m1);

        Movable m2 = new MovableCircle(5, 7, 3, 9, 2);
        System.out.println(m2);
        m2.moveRight();
        System.out.println(m2);
        m2.moveLeft();
        System.out.println(m2);
    }
}
