import java.util.Scanner;

public class Method {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base: ");
        int base = sc.nextInt();
        System.out.println();
        System.out.print("Enter the exponent: ");
        int exp = sc.nextInt();
        Method allMethod = new Method();
        System.out.print(base + " raises to the power of " + exp + " is " + allMethod.exponent(base, exp));
        sc.close();
    }

    public static int exponent(int base, int exp) {
        int product = 1;
        for (int idx = 1; idx <= exp; idx++) {
            product *= base;
        }
        return product;

    }
}
