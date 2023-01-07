package Exercise1_4;

public class TestMain {
    public static void main(String[] args) {
        Ball ball = new Ball(40, 50, 6, 12, 26);
        Container box = new Container(12, 10, 100, 100);
        for (int step = 0; step < 100; ++step) {
            ball.move();
            box.collidesWith(ball);
            System.out.println(ball);
        }
    }
}
