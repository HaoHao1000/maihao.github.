import java.util.Scanner;

public class PrintArrayInStars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of items: ");
        final int NUM_ITEMS = sc.nextInt();
        int[] items = new int[NUM_ITEMS];

        if (items.length > 0) {
            System.out.println("Enter the value of all items: ");
            for (int i = 0; i < items.length; ++i) {
                items[i] = sc.nextInt();
            }
        }
        sc.close();

        for (int idx = 0; idx < items.length; ++idx) {
            System.out.print(idx + ": ");
            for (int starNo = 1; starNo <= items[idx]; ++starNo) { // column
                System.out.print("*");
            }
            System.out.print("(" + items[idx] + ")");
            System.out.println();
        }


    }
}
