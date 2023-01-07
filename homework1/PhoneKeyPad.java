import java.util.Scanner;

public class PhoneKeyPad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String inStr = sc.next();
        inStr = inStr.toLowerCase();
        int inStrLen = inStr.length();

        for( int i = 0; i < inStrLen; i ++ ) {
            char inChar = inStr.charAt(i);
            switch (inChar) {
                case 'a' :
                    System.out.print("2");
                    break;
                case 'b' :
                    System.out.print("2");
                    break;
                case 'c' :
                    System.out.print("2");
                    break;
                case 'd' :
                    System.out.print("3");
                    break;
                case 'e' :
                    System.out.print("3");
                    break;
                case 'f' :
                    System.out.print("3");
                    break;
                case 'g' :
                    System.out.print("4");
                    break;
                case 'h' :
                    System.out.print("4");
                    break;
                case 'i' :
                    System.out.print("4");
                    break;
                case 'j' :
                    System.out.print("5");
                    break;
                case 'k' :
                    System.out.print("5");
                    break;
                case 'l' :
                    System.out.print("5");
                    break;
                case 'm' :
                    System.out.print("6");
                    break;
                case 'n' :
                    System.out.print("6");
                    break;
                case 'o' :
                    System.out.print("6");
                    break;
                case 'p' :
                    System.out.print("7");
                    break;
                case 'q' :
                    System.out.print("7");
                    break;
                case 'r' :
                    System.out.print("7");
                    break;
                case 's' :
                    System.out.print("7");
                    break;
                case 't' :
                    System.out.print("8");
                    break;
                case 'u' :
                    System.out.print("8");
                    break;
                case 'v' :
                    System.out.print("8");
                    break;
                case 'w' :
                    System.out.print("9");
                    break;
                case 'x' :
                    System.out.print("9");
                    break;
                case 'y' :
                    System.out.print("9");
                    break;
                case 'z' :
                    System.out.print("9");
                    break;

            }
        }
        System.out.println();
    }
}
