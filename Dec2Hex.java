import java.util.logging.*;
class Dec2Hex {
    private static final Logger logger = Logger.getLogger(Dec2Hex.class.getName());
    public static int Arg1;

    public static void main(String args[]) {
        LogManager.getLogManager().reset();
        logger.setLevel(Level.INFO);

        if (args.length == 0) {
            logger.severe("Errror: No input argument provided.");
            return;
        }

        try {
            Arg1 = Integer.parseInt(args[0]);
            int num = Arg1;
            String hexadecimal = "";
            logger.info(String.format("Starting conversion for decimal value: %d", num));
            hexadecimal = toHexadecimal(num);
            logger.info(String.format("Hexadecimal representation for %d is: %s", num, hexadecimal));
            logger.info("Conversion process completed.");
        } catch (NumberFormatException e) {
            logger.severe("Error: Invalid input. Please provide a valid integer.");
        }
    }

    public static String toHexadecimal(int num) {
        char ch[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        String hexadecimal = "";

        if (num == 0) {
            return "0";
        }

        while (num != 0) {
            int rem = num % 16;
            hexadecimal = ch[rem] + hexadecimal;
            num = num / 16;
        }

        return hexadecimal;
    }
}
