package com.bit.task1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * The BracketCombinations class provides a method to calculate the number of valid parentheses expressions
 *
 * @since 30.12.2024
 * @author Bohdan Pakhar
 * @version 1.0
 */
public class BracketCombinations {

    /**
     * The method implements the Eugene Charles Catalan number by dynamic programming.
     *
     * @param countOfPairs count of pairs of parentheses
     * @return returns the number of possible correct expressions with
     * parentheses for the given number of pairs of parentheses
     */
    public static BigInteger countCatalan(int countOfPairs) {
        // Create array to save Catalan's numbers
        BigInteger[] catalan = new BigInteger[countOfPairs + 1];

        // Base case: C(0) = 1
        catalan[0] = BigInteger.ONE;

        // Calculate Catalan numbers for all values from 1 to 'countOfPairs'
        for (int i = 1; i <= countOfPairs; i++) {
            catalan[i] = BigInteger.ZERO; // Initialize the i-th Catalan number
            for (int j = 0; j < i; j++) {
                // Calculate catalan[i] as sum of catalan[j] * catalan[i - j - 1]
                catalan[i] = catalan[i].add(catalan[j].multiply(catalan[i - j - 1]));
            }
        }

        return catalan[countOfPairs]; // Return the Catalan number for the given countOfPairs
    }
}
