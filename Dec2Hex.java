import java.util.Scanner;

class Dec2Hex
{
public static String convertToHex(int decimal) {
    char ch[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    int rem, num;
    num = decimal;
    String hexadecimal = "";
    System.out.println("Converting the Decimal Value " + num + " to Hex...");
    while (num != 0) {
        rem = num % 16;
        hexadecimal = ch[rem] + hexadecimal;
        num = num / 16;
    }

   return "Hexadecimal representation is- " + hexadecimal;
    }
}
