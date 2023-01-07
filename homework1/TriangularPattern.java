import java.util.Scanner;
public class TriangularPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        System.out.println();
        TriangularPattern printPattern = new TriangularPattern();
        System.out.println("This is TriangularPatternA: ");
        printPattern.TriangularPatternA(size);
        System.out.println("This is TriangularPatternB: ");
        printPattern.TriangularPatternB(size);
        System.out.println("This is TriangularPatternC: ");
        printPattern.TriangularPatternC(size);
        System.out.println("This is TriangularPatternD: ");
        printPattern.TriangularPatternD(size);
    }
    public void TriangularPatternA( int size ){
            for (int row = 1; row <= size; row++) {
                for (int col = 1; col <= size; col++) {
                    if (row >= col) {
                        System.out.print("#");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
    }
    public void TriangularPatternB( int size ) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row + col <= size + 1) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
        System.out.println();
       }
    }

    public void TriangularPatternC( int size ) {
        for( int row = 1; row <= size; row ++ ){
            for( int col = 1; col <= size; col ++ ){
                if ( row <= col ) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public void TriangularPatternD( int size ) {
        for( int row = 1; row <= size; row ++ ) {
            for( int col = 1; col <= size; col ++ ) {
                if ( row + col >= size + 1 ) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }



}

