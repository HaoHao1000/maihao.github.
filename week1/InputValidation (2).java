package week1;

import java.util.Scanner;

public class InputValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberIn;
		boolean isValid = false;
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.print("Enter a number between 0-10 or 90-100: ");
            numberIn  = sc.nextInt();
            if ( numberIn  >= 0 && numberIn <= 10 || numberIn >= 90 && numberIn <= 100){
                isValid = true;
                System.out.println("You have entered: "+ numberIn);
            }
            else {
                System.out.println("Invalid input, try again...");
            }
        }
        while (!isValid);
	}

}
