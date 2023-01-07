import java.util.Scanner;

public class CountVowelsDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String inStr = sc.next();
        int inStrLen = inStr.length();
        inStr = inStr.toLowerCase();
        int countVowels = 0;
        int countDigits = 0;
        System.out.println();

        for( int charIdx = 0; charIdx < inStrLen; charIdx ++ ) {
            char index = inStr.charAt(charIdx);
            if ( index == 'a' || index == 'e' || index == 'u' || index == 'i' || index == 'o' ) {
                countVowels += 1;
            } else if ( index >= '0' && index <= '9' ) {
                countDigits += 1;
            }
        }
        double calVowels = ((countVowels/inStrLen) * 100 );
        System.out.println(Math.round(calVowels * 100) / 100);
        System.out.println(calVowels);

    }
}
