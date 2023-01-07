import java.util.Scanner;

public class DecipherCaesarCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a plaintext string: ");
        String inStr = sc.next();
        inStr = inStr.toUpperCase();
        int inStrLen = inStr.length();
        String outStr = "";

        for( int index = 0; index < inStrLen; index ++ ) {
            char inChar = inStr.charAt(index);
            if ( inChar >= 'D' && inChar <= 'Z' ) {
                inChar = (char) (inChar - 3);
            } else if ( inChar == 'A') {
                inChar = 'X';
            } else if ( inChar == 'B' ) {
                inChar = 'Y';
            } else if ( inChar == 'C') {
                inChar = 'Z';
            }
            outStr = outStr + inChar;
        }
        System.out.printf("The ciphertext string is: %s",outStr);

    }
}
