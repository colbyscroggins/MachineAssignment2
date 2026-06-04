/*
 * Colby Scroggins
 * CS 417
 * Machine Assignment 2
 */

package machineassignment2;

/**
 * This class converts a decimal fraction to its binary representation.
 */
public class ConvertDecToBin {

    public static final int MAX_DIGITS = 8;

    /**
     * The main method takes decimal fractions as command-line arguments and prints their binary representations.
     * @param args the decimal fractions to convert, passed as command-line arguments
     */
    public static void main(String[] args) {
        System.out.println("| Base 10 | Base 2 |");
        System.out.println("| :-------|:-------|");

        for (String arg : args) {
            double x = Double.parseDouble(arg);
            String binaryResult = convertFractionToBinary(x);
            
            System.out.printf("| %-7s | %-6s |%n", arg, binaryResult);
        }
    }

    /**
     * Converts a decimal fraction to its binary representation.
     * @param x the decimal fraction to convert
     * @return the binary representation of the decimal fraction as a string
     */
    private static String convertFractionToBinary(double x) {
        if (x == 0.0) {
            return "0.0";
        }

        StringBuilder binaryOutput = new StringBuilder("0.");
        double c = x;
        int i = 0;

        /*
         * Chapter 1 Algorithm
         * while c_i != 0 and i <= I_max do
         */
        while (c != 0.0 && i < MAX_DIGITS) {
            // i = i + 1
            i++;

            double product = c * 2.0;

            // b_i = (betac_i-1)_I
            int b = (int) product; 
            // c_i = (betac_i-1)_F
            c = product - b;       

            binaryOutput.append(b);
        }
        return binaryOutput.toString();
    }
}
