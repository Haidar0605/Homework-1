package com.sytexpro.homeworks.variables.data.type;


import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number (A): ");
        double a = scanner.nextDouble();

        System.out.print("Enter the second number (B): ");
        double b = scanner.nextDouble();

        System.out.print("Enter the third number (C): ");
        double c = scanner.nextDouble();

        // Calculate the average
        double average = (a + b + c) / 3;

        // Print the result
        System.out.println("The average of " + a + ", " + b + ", and " + c + " is: " + average);

        // Close the scanner
        scanner.close();

    }
}
