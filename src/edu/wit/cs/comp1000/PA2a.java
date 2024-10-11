package edu.wit.cs.comp1000;
/**
 * 
 * the purpose of this program is to accurately reflect sums and averages based on user input of 5 whole numbers, positive or negative
 */
import java.util.Scanner;

public class PA2a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter five whole numbers: ");

        int countPos = 0, countNonPos = 0;
        int sumPos = 0, sumNonPos = 0;
        int totalSum = 0;

        /**
         * read inputs and calculate sums and counts
         * 
         */
        for (int i = 0; i < 5; i++) {
            int number = sc.nextInt();
            totalSum += number;
            if (number > 0) {
                sumPos += number;
                countPos++;
            } else {
                sumNonPos += number;
                countNonPos++;
            }
        }

        /**
         * calculate averages
         * 
         * 
         */
        double avgPos = countPos > 0 ? (double) sumPos / countPos : 0.00;
        double avgNonPos = countNonPos > 0 ? (double) sumNonPos / countNonPos : 0.00;
        double avgTotal = (double) totalSum / 5;  // Ensure average of total is calculated correctly

        /**
         * 
         * Plural differenciators
         */
        String numPosText = countPos == 1 ? "number" : "numbers";
        String numNonPosText = countNonPos == 1 ? "number" : "numbers";

        /**
         * 
         * print results
         * 
         */
        System.out.printf("The sum of the %d positive %s: %d%n", countPos, numPosText, sumPos);
        System.out.printf("The sum of the %d non-positive %s: %d%n", countNonPos, numNonPosText, sumNonPos);
        System.out.printf("The sum of the 5 numbers: %d%n", totalSum);
        System.out.printf("The average of the %d positive %s: %.2f%n", countPos, numPosText, avgPos);
        System.out.printf("The average of the %d non-positive %s: %.2f%n", countNonPos, numNonPosText, avgNonPos);
        System.out.printf("The average of the 5 numbers: %.2f%n", avgTotal);

        sc.close();
    }
}
