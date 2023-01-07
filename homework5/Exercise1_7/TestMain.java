package Exercise1_7;

import java.util.Scanner;

public class TestMain {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter complex number 1 (real and imaginary part): ");
        double real1 = sc.nextDouble();
        double imag1 = sc.nextDouble();
        MyComplex num1 = new MyComplex(real1, imag1);
        System.out.println();
        System.out.println("Enter complex number 2 (realand imaginary part): ");
        double real2 = sc.nextDouble();
        double imag2 = sc.nextDouble();
        MyComplex num2 = new MyComplex(real2, imag2);

        System.out.println("Number 1 is: " + num1.toString());
        System.out.println("Number 2 is: " + num2.toString());
        System.out.println("Check if number 1 is real: " + num1.isReal());
        System.out.println("Check if number 1 is equals to number 2: " + num1.equals(num2));
        System.out.println("Number 1 add new number 2: " + num1.addNew(num2));


    }
}
