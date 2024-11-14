import java.util.logging.*;

class Dec2Hex {
    private static final Logger logger = Logger.getLogger(Dec2Hex.class.getName());

    public static int Arg1;

    public static void main(String args[]) {
        LogManager.getLogManager().reset();
        logger.setLevel(Level.INFO);

        if (args.length == 0) {
            logger.severe("Error: No input argument provided.");
            return;
        }

        try {
            Arg1 = Integer.parseInt(args[0]);
            int rem, num;
            num = Arg1;
            String hexadecimal = "";
            logger.info("Converting the Decimal Value " + num + " to Hex...");

            hexadecimal = toHexadecimal(num);

            logger.info("Hexadecimal representation is: " + hexadecimal);
        } catch (NumberFormatException e) {
            logger.severe("Error: Invalid input. Please provide a valid integer.");
        }
    }

    public static String toHexadecimal(int num) {
        char ch[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        String hexadecimal = "";

        if (num==0) {
            return hexadecimal = "0";
        }

        while (num != 0) {
            int rem = num % 16;
            hexadecimal = ch[rem] + hexadecimal;
            num = num / 16;
        }

        return hexadecimal;
    }
}
