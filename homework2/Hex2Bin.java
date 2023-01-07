import java.util.Scanner;

public class Hex2Bin {
    static final String[] HEX_BITS = {"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a Hexadecimal string: ");
        String hexa = sc.next();
        hexa = hexa.toLowerCase();
        Hex2Bin hex2bin = new Hex2Bin();
        if (hex2bin.isHex(hexa) == true) {
            hex2bin.convertHexa(hexa);
        }

    }

    public static boolean isHex(String hexa) {
        for (int idx = 0; idx < hexa.length(); idx++) {
            if ((Character.digit(hexa.charAt(idx), 16)) < 0) {
                return false;
            }
        }
        return true;
    }

    public static void convertHexa(String hexa) {
        System.out.print("The equivalent binary for hexadecimal " + hexa + "is: ");
        for (int idx = 0; idx < hexa.length(); idx++) {
            int convertNumber = Character.digit(hexa.charAt(idx), 16);
            System.out.print(HEX_BITS[convertNumber]);
            System.out.print(" ");
        }
        System.out.println();
    }
}
