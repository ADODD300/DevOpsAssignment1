import java.util.Scanner;
public class Dec2Hex {

    public static String toHexadecimal(int num) {
        char ch[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        String hexadecimal = "";

        while (num != 0) {
            int rem = num % 16;
            hexadecimal = ch[rem] + hexadecimal;
            num = num / 16;
        }

        return hexadecimal;
    }

    public static void main(String[] args) {
        int decimal = Integer.parseInt(args[0]);
        System.out.println("Converting the Decimal Value " + decimal + " to Hex...");
        System.out.println("Hexadecimal representation is: " + toHexadecimal(decimal));
    }
}
