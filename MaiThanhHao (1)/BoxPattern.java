import java.util.Scanner;

public class BoxPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        System.out.println();
        BoxPattern printBoxPattern = new BoxPattern();
        printBoxPattern.BoxPatternA(size);
        printBoxPattern.BoxPatternB(size);
        printBoxPattern.BoxPatternC(size);
        printBoxPattern.BoxPatternD(size);
    }
    public void BoxPatternA( int size ) {
        for( int row = 1; row <= size; row ++ ) {
            for ( int col = 1; col <= size; col ++ ) {
                if (row == 1 || row == size || col == 1 || col == size) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public void BoxPatternB( int size ) {
        for( int row = 1; row <= size; row ++ ) {
            for (int col = 1; col <= size; col++) {
                if ( row == 1 || row == size || row == col ) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public void BoxPatternC( int size ) {
        for( int row = 1; row <= size; row ++ ) {
            for (int col = 1; col <= size; col++) {
                if ( (col + row) == (size + 1) || row == 1 || row == size ) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }

    public void BoxPatternD( int size ) {
        for( int row = 1; row <= size; row ++ ) {
            for (int col = 1; col <= size; col++) {
                if ( (col + row) == (size + 1) || row == 1 || row == size || row == col ) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}
