import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MagicSum sumNumber = new MagicSum();
        int sum = 0;
        final int SENTINEL = -1;
        System.out.print("Enter a positive integer (or −1 to end): ");
        int number = sc.nextInt();
        while (number != SENTINEL) {
            System.out.print("Enter a positive integer (or −1 to end): ");
            System.out.println();
            number = sc.nextInt();
            if (sumNumber.hasEight(number) == true) {
                sum += number;
            }
        }
        System.out.println("The magic sum is: " + sum);


    }

    public static boolean hasEight(int number) {
        int rest = number % 10;
        if (rest != 8) {
            return false;
        }
        return true;
    }
}
