
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
	
		int fn ; // F(n) t o be computed
		int fnMinus1 = 1 ; // F(n−1) , i n i t t o F( 2 )
		int fnMinus2 = 1 ; // F(n−2) , i n i t t o F( 1 )
		int nMax = 20; // maximum n , i n c l u s i v e
		int sum = fnMinus1 + fnMinus2 ; // Need sum t o compute a v e r a g e
		double average ;
	
		System.out.println("The first " + nMax + " Fibonacci numbers are: " ) ;
		
		while (n <= nMax) { 
			fn = fnMinus1 + fnMinus2;
			sum += fn;
			++n;
			fnMinus2 = fnMinus1;
			fnMinus1 = fn;
	    }
		System.out.println((double) sum/nMax);
	}

}
