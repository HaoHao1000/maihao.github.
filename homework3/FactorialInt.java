public class FactorialInt {

    public static void main(String[] args) {
        printIntFactorial();
        System.out.println();
        printLongFactorial();

    }

    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }

    public static void printIntFactorial() {
        System.out.println("Part 1 (int)");
        int i = 1;
        while (true) {
            long result = factorial(i);
            if (result < Integer.MAX_VALUE) {
                System.out.println("The factorial of " + i + " is " + result);
            } else {
                System.out.println("The factorial of " + i + " is out of range.");
                break;
            }
            i++;
        }
    }

    public static void printLongFactorial() {
        System.out.println("Part 2 (long)");
        int idx = 1;
        while (true) {
            System.out.println("The factorial of " + idx + " is: " + factorial(idx));
            if (Long.MAX_VALUE / factorial(idx) < (idx + 1)) {
                System.out.println("The factorial of " + (idx + 1) + " is out of range.");
                break;
            }
            idx++;
        }
    }
}
