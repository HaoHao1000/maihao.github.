import java.util.Scanner;

public class HillPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows: ");
        int numRows = sc.nextInt();
        int numCol = 2 * numRows;
        System.out.println();
        HillPattern printHillPattern = new HillPattern();
        printHillPattern.HillPatternA(numRows, numCol);
        printHillPattern.HillPatternB(numRows, numCol);
        System.out.println("C: ");
        printHillPattern.HillPatternC(numRows, numCol);

    }

    public void HillPatternA( int numRows, int numCol ) {
        for ( int row = 1; row <= numRows; row ++ ) {
            for( int col = 1; col <= numCol; col ++ ) {
                if ( (row + col >= numRows + 1) && (row >= col - numRows + 1)) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public void HillPatternB( int numRows, int numCol ) {
        for ( int row = 1; row <= numRows; row ++ ) {
            for (int col = 1; col <= numCol; col++) {
                if ( (col >= row) && (col + row <= numCol) ) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public void HillPatternC( int numRows, int numCol ) {
        for ( int row = 1; row <= numCol; row ++ ) {
            for (int col = 1; col <= numCol; col++) {
                if ( ( row >= 1 ) && ( row <= numRows ) ) {
                    if ( (row + col >= numRows + 1) && (row >= col - numRows + 1) ) {
                        System.out.print("#");
                    } else {
                        System.out.print(" ");
                    }
                } else if ( (row > numRows) && (row <= numCol) ) {
                    if ( ((col + row) <= (numCol + numRows)) && ((col + row) >= numCol) ) {
                        System.out.print("#");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
