import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String inStr = sc.next();
        int inStrLen = inStr.length();
        System.out.println();

        for( int charIdx = inStrLen - 1; charIdx >= 0; --charIdx ) {
            System.out.print(inStr.charAt(charIdx));
        }
    }
}
