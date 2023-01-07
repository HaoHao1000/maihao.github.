import java.util.Scanner;

public class Fibonacci {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhập n: ");
        int n = sc.nextInt();
        System.out.println(calFibo(n));
    }

    public static int calFibo(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return calFibo(n - 1) + calFibo(n - 2);
        }
    }
}
