/*
 * Colby Scroggins
 * CS 417
 * Machine Assignment 2
 */

package machineassignment2;

/**
 * This class converts a decimal fraction to its representation in a specified base.
 */
public class ConvertDecToBaseN {

    public static final int MAX_DIGITS = 8;

    /**
     * The main method takes a base value as the first argument, followed by decimal fractions to convert, 
     * and prints the results in a formatted table.
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Invalid args");
            return;
        }

        int base = Integer.parseInt(args[0]);

        System.out.printf("| Base 10  | Base %d |%n", base);
        System.out.println("| :--------|:--------|");

        for (int i = 1; i < args.length; i++) {
            String arg = args[i];
            double x = Double.parseDouble(arg);
            String result = convertFractionToBaseN(x, base);

            System.out.printf("| %-8s | %-7s |%n", arg, result);
        }
    }

    /**
     * Converts a decimal fraction to its representation in a specified base.
     * @param x the decimal fraction to convert
     * @param base the base to convert to
     * @return the representation of the decimal fraction in the specified base as a string
     */
    private static String convertFractionToBaseN(double x, int base) {
        if (x == 0.0) {
            return "0.0";
        }

        StringBuilder output = new StringBuilder("0.");
        double c = x;
        int i = 0;

        /*
         * Chapter 1 Algorithm
         * while c_i != 0 and i <= I_max do
         */
        while (c != 0.0 && i < MAX_DIGITS) {
            // i = i + 1
            i++;

            // Use target base
            double product = c * base;

            // b_i = (betac_i-1)_I
            int b = (int) product; 
            // c_i = (betac_i-1)_F
            c = product - b;       

            // Semicolon to separate digits
            if (i > 1) {
                output.append(";");
            }
            output.append(b);
        }
        return output.toString();
    }
}
