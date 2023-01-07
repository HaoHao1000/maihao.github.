
public class CheckOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 50;
		System.out.println("The number is " + number);
		if ( number > 0 ){
			if ( (number % 2 == 0) ){
				System.out.println("Odd Number");
			} else {
				System.out.println("Even Number");
			}
		}
		System.out.println("Bye!");
	}
}
