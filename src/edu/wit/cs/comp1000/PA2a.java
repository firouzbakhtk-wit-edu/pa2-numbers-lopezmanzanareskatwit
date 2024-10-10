package edu.wit.cs.comp1000;

import java.util.Scanner;
/**
 * the purpose of this program is to take the sum of 5 whole numbers, positive or negative and calculate the sum and average of those numbers
 * 
 */
public class PA2a {

    public static void main(String[] args) {
/**
 * scanner input and prompts the user to input 5 whole numbers, positive or negative
 * 
 * 
 * 
 */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter five whole numbers: ");

        int[] numbers = new int[5];
        int countPos = 0, countNonPos = 0;
        int sumPos = 0, sumNonPos = 0;
        int totalSum = 0;

        /**
		 * reading inputs and calculating
		 * 
		 */
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
            totalSum += numbers[i];
            if (numbers[i] > 0) {
                sumPos += numbers[i];
                countPos++;
            } else {
                sumNonPos += numbers[i];
                countNonPos++;
            }
        }

        /**
		 * calculating averages
		 * 
		 */
        double avgPos = countPos > 0 ? (double) sumPos / countPos : 0.00;
        double avgNonPos = countNonPos > 0 ? (double) sumNonPos / countNonPos : 0.00;
        double avgTotal = (double) totalSum / 5;

        /**
		 * plural differentiator
		 * 
		 */
        String numPosText = countPos == 1 ? "number" : "numbers";
        String numNonPosText = countNonPos == 1 ? "number" : "numbers";

        /**
		 * prints out the results of the sum of the non positive and non positive numbers, the averages, etc
		 * 
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
