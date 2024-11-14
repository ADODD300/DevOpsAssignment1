class Dec2Hex {
    public static int Arg1;

    public static void main(String args[]) {
        if (args.length == 0) {
            System.out.println("Error: No input argument provided.");
            return; // Exits the program if no argument is given.
        }

        try {
            Arg1 = Integer.parseInt(args[0]);
            int rem, num;
            num = Arg1;
            String hexadecimal = "";
            System.out.println("Converting the Decimal Value " + num + " to Hex...");

            hexadecimal = toHexadecimal(num);

            System.out.println("Hexadecimal representation is: " + hexadecimal);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input. Please provide a valid integer.");
        }
    }

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
}
