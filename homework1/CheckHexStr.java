import java.util.Scanner;

public class CheckHexStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a hex string: ");
        String inStr = sc.next();
        int inStrLen = inStr.length();
        String outStr = "";

        for ( int index = 0; index < inStrLen; index ++ ) {
            char inChar = inStr.charAt(index);
            if ((( inChar >= '0' && inChar <= '9' || (inChar >= 'A' && inChar <= 'F' ) || (inChar >= 'a' && inChar <= 'f'  )))) {
                System.out.printf("%s is a hex string",inStr);
            } else {
                System.out.printf("%s is NOT a hex string",inStr);
            }
        }
    }
}
