import java.util.Scanner;
public class PrintArray {
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
        System.out.print("The values are :");
        for (int i = 0; i < items.length; ++i ) {
            if ( i == 0 ) {
                System.out.print("[" + items[i] + ", " );
            } else if ( i > 0 && i <= items.length - 2 ) {
                System.out.print(items[i] + ", ");
            } else if ( i == items.length - 1 ) {
                System.out.print(items[i] + "]");
            }
        }
    }
}
