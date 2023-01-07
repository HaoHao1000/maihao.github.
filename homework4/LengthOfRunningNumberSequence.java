import java.util.Scanner;

public class LengthOfRunningNumberSequence {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhập n: ");
        int n = sc.nextInt();
        System.out.println("S(" + n + ")" + " = " + calLen(n));
    }

    public static String calLen(int n) {
        if (n == 1) {
            return "1";
        } else {
            return calLen(n - 1) + n;
        }
    }
}
