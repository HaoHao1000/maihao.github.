package week1;
import java.util.Scanner;
public class SumPro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		int number3 = sc.nextInt();
		int sum = number1 + number2 +number3;
		int product = number1*number2*number3;
		int min = number1;
        if (number2 < min){
            min = number2;
        }
        if (number3 < min){
            min = number3;
        }
        int max = number1;
        if (number2 > max){
            max = number2;
        }
        if (number3 > max){
            max = number3;
        }
        System.out.println("The sum is : "+ sum);
        System.out.println("The product is : "+ product);
        System.out.println("The min is : "+ min);
        System.out.println("The max is : "+ max);
	}

}
