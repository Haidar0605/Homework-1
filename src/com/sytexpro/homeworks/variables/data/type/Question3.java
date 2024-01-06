package com.sytexpro.homeworks.variables.data.type;

import java.util.Scanner;

public class Question3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input costs of items
        System.out.print("Enter the cost of a pencil: ");
        float pencilCost = scanner.nextFloat();

        System.out.print("Enter the cost of a pen: ");
        float penCost = scanner.nextFloat();

        System.out.print("Enter the cost of an eraser: ");
        float eraserCost = scanner.nextFloat();

        // Calculate total cost without GST
        float totalCostWithoutGST = pencilCost + penCost + eraserCost;

        // Calculate GST (18%)
        float gst = 0.18f * totalCostWithoutGST;

        // Calculate total cost with GST
        float totalCostWithGST = totalCostWithoutGST + gst;

        // Print the bill
        System.out.println("\nShopping Bill:");
        System.out.println("Pencil Cost: $" + pencilCost);
        System.out.println("Pen Cost: $" + penCost);
        System.out.println("Eraser Cost: $" + eraserCost);
        System.out.println("\nTotal Cost without GST: $" + totalCostWithoutGST);
        System.out.println("GST (18%): $" + gst);
        System.out.println("Total Cost with GST: $" + totalCostWithGST);

        // Close the scanner
        scanner.close();
    }

}
