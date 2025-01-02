package com.bit.task3;

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
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("The sum of the digits in the number " + num
                + " = " + Factorioal.getSumOfFactorialNumbers(num));
    }
}
