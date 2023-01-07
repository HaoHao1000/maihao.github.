import java.util.Scanner;

public class FactorialRecusive {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhập n: ");
        int n = sc.nextInt();
        System.out.println(calFactorial(n));
    }

    public static int calFactorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * calFactorial(n - 1);
        }
    }
}
