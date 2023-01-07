package week1;
import java.util.Scanner;
public class ReverseInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter a positive integer: ");
        int inNumber = sc.nextInt();
        int inDigit;
        int newNumber = 0;
        while ( inNumber > 0 ){
            inDigit = inNumber % 10;
            newNumber = newNumber*10 + inDigit;
            inNumber/=10;
        }
        System.out.println("The reverse is :" + newNumber);
	}

}
