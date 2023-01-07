package Exercise1_3;

public class TestMain {
    public static void main(String[] args) {
        MovablePoint p1 = new MovablePoint(26, 3,3,3);
        System.out.println(p1);
        p1.moveDown();
        System.out.println(p1);
        p1.moveRight();
        System.out.println(p1);

        // Test Polymorphism
        Movable p2 = new MovablePoint(2, 6,3,3);  // upcast
        p2.moveUp();
        System.out.println(p2);

        MovablePoint p3 = (MovablePoint)p2;   // downcast
        System.out.println(p3);
    }
}
