package com.bit.task1;

import java.util.Scanner;

/**
 * Main class
 *
 * @since 30.12.2024
 * @author Bohdan Pakhar
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int count;

        System.out.print("Enter num of parentheses pairs (N >= 0): ");
        count = scanner.nextInt();
        System.out.println("Result: " + BracketCombinations.countCatalan(count));

    }
}