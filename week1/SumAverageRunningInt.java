
public class SumAverageRunningInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		double average;
		int count = 0;
		final int LOWERBOUND = 1;
		final int UPPERBOUND = 100;
		for ( int number = LOWERBOUND; number <= UPPERBOUND; number++ ) {
			sum += number;
			count += 1;
		}
		average = (double) (sum/count);
		System.out.println("The sum of " + LOWERBOUND + " to " + UPPERBOUND + " is " + sum);
		System.out.println("The average is " + average);
		
	
	// Sum of squares
		int sumSquares = 0;
		for ( int number = LOWERBOUND; number <= UPPERBOUND; number++) {
			sumSquares += number * number;
		}
		System.out.println("Sum of squares is " + sumSquares);
	// Sum of OddNumber and EvenNumber
		int sumOdd = 0;
		int sumEven = 0;
		int absDiff;
		
		for ( int number = LOWERBOUND; number <= UPPERBOUND; number++ ) {
			if ( number > 0 ) {
				if ( number % 2 == 0 ){
					sumOdd += number;
				} else {
					sumEven += number;
				}
			}
		}
		if ( sumOdd > sumEven ){
			absDiff = 0;
		} else {
			absDiff = 1;
		}
		System.out.println("Sum of OddNumber is " + sumOdd);
		System.out.println("Sum of EvenNumber is " + sumEven);
	    }
	 	

	 	
}

	
	
