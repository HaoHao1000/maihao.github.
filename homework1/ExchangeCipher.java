import java.util.Scanner;

public class ExchangeCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a plaintext string: ");
        String inStr = sc.next();
        inStr = inStr.toUpperCase();
        int inStrLen = inStr.length();
        String outStr = "";

        for ( int index = 0; index < inStrLen; index ++ ) {
            char inChar = inStr.charAt(index);
            if ( inChar >= 'A' && inChar <= 'Z' ) {
                for ( char index_13 = 'A'; index_13 <= 'Z'; index_13 ++ ) {
                    if ( inChar + index_13 == 27 ) {
                        inChar = index_13;
                    }
                }
            }
            outStr = outStr + inChar;
        }
        System.out.printf("The ciphertext string is: %s",outStr);
    }
}
