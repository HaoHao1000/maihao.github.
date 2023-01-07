import java.util.Scanner;

public class CaesarCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a plaintext string: ");
        String inStr = sc.next();
        inStr = inStr.toUpperCase();
        int inStrLen = inStr.length();
        String outStr = "";

        for( int index = 0; index < inStrLen; index ++ ) {
            char inChar = inStr.charAt(index);
            if ( inChar >= 'A' && inChar <= 'W' ) {
                inChar = (char) (inChar + 3);
            } else if ( inChar == 'X') {
                inChar = 'A';
            } else if ( inChar == 'Y' ) {
                inChar = 'B';
            } else if ( inChar == 'Z') {
                inChar = 'C';
            }
            outStr = outStr + inChar;
        }
        System.out.printf("The ciphertext string is: %s",outStr);
    }
}
