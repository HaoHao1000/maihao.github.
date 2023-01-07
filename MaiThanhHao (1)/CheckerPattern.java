import java.util.Scanner;
public class CheckerPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        for ( int row = 1; row <= size; row ++ ) {
            if( row % 2 != 0) {
                for( int col = 1; col <= size; col ++) {
                    System.out.printf("#");
                }
                System.out.printf("\n");
            } else {

                for( int col = 1; col <= size; col ++) {
                    if( col == 1 ) {
                        System.out.printf(" ");
                    }
                    System.out.printf("#");
                }
                System.out.printf("\n");
            }

        }
    }
}
