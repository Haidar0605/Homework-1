package com.sytexpro.homeworks.variables.data.type;

import java.util.Scanner;
public class Question2 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the side length of the square: ");
        double sideLength = scanner.nextDouble();

        // Calculate the area of the square
        double area = sideLength * sideLength;

        // Print the result
        System.out.println("The area of the square with side length " + sideLength + " is: " + area);

        // Close the scanner
        scanner.close();
    }
}

