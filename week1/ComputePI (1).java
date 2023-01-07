
public class ComputePI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum = 0.0;
		int MAXDENOMINATOR = 1000;
		for (int i = 1; i <= MAXDENOMINATOR; i++) {
			if (i % 4 == 1){
				sum += 1.0/i;
			} else if (i % 4 == 3){
				sum -= 1.0/i;
			} 
		}
		System.out.println("Sum is " + 4*sum);
		
	// 
		final int MAXTERM = 10000; // number o f terms used i n computation
		double newSum = 0.0 ;
		for (int term = 1 ; term <= MAXTERM; term ++ ) { 

		// term = 1 , 2 , 3 , 4 , . . . , MAXTERM
			if (term % 2 == 1) { // odd term number : add

				newSum += 1.0/(2*term - 1);

			} else { // even term number : s u b t r a c t
                newSum -= 1.0 / ((term * 2) - 1);
		 }
		}
		System.out.println("New Sum is " + newSum);
		System.out.println((4*newSum/ Math.PI)*100);
	}

}
