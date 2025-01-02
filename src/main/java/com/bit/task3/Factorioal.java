package com.bit.task3;

import java.math.BigInteger;

/**
 * Factorial class contains methods to compute the factorial of a number and the sum of its digits.
 *
 * @since 2.01.2025
 * @author Bohdan Pakhar
 * @version 1.0
 */
public class Factorioal {

    /**
     * Computes the sum of digits of the factorial of the given number.
     *
     * @param num the number whose factorial's digits will be summed
     * @return the sum of digits of the factorial of the given number
     */
    public static int getSumOfFactorialNumbers(int num) {
        String string = getFactorial(num).toString();
        int result = 0;

        // Iterate through each character (digit) of the factorial string
        for (char digit : string.toCharArray()) {
            // Convert the character to an integer and add it to the result
            result += Character.getNumericValue(digit);
        }

        return result;
    }

    /**
     * Computes the factorial of the given number.
     *
     * @param num the number whose factorial is to be computed
     * @return the factorial of the given number as a BigInteger
     */
    private static BigInteger getFactorial(int num) {
        BigInteger factorial = BigInteger.ONE;
        for (int i = 1; i < num; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }
}
