package week1;

import java.util.Scanner;

public class AverageWithInputValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		final int NUMSTUDENTS = 3;
        int numberIn;
        boolean isValid;
        int sum = 0;
        double average;
       
        for(int studentNo = 1; studentNo <= NUMSTUDENTS; studentNo++){
            isValid = false;
            do {
                System.out.print("Enter the mark (0-100) for student " + studentNo +":");
                numberIn = sc.nextInt();
                if (numberIn >= 0 && numberIn <= 100){
                    isValid = true;
                    sum += numberIn;
                }
                else {
                    System.out.println("Invalid input, try again...");
                }

            } while (!isValid);
        }
        average = sum/NUMSTUDENTS;
        System.out.printf("The average is: %.5f%n", average);
	}

}
