
public class HarmonicSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int MAXDENOMINATOR = 50000;
		double sumL2R = 0.0;
		double sumR2L = 0.0;
		double absDiff;
		
		for (int denominator = 1; denominator <= MAXDENOMINATOR; ++denominator) {
			 sumL2R += 1.0/denominator;
		}
		System.out.println("The sum from left-to-right is: " + sumL2R);
		for (int index = MAXDENOMINATOR; index > 0; index++){
			sumR2L += 1.0/index;
		}
		System.out.println("The sum from right-to-left is: " + sumR2L);
		if (sumR2L < sumL2R) {
			absDiff = sumL2R - sumR2L;
			System.out.println("Differences is " + absDiff);
		} else {
			absDiff = sumR2L - sumL2R;
			System.out.println("Differences is " + absDiff);
			
		}
	}

}
