package edu.wit.cs.comp1000;

import java.util.Scanner;

// TODO: document this class
public class PA2a {

	// TODO: document this function
	public static void main(String[] args) {
		// TODO: write your code here
		Scanner scanner = new Int [5];
		System.out.printf("Enter five whole numbers: ");

//variables to track the count and sum of positive and negative numbers
int[] numbers = new int [5];
int countPos = 0, countNonPos = 0;
int sumPos = 0, sumNonPos = 0, sum = 0;

for (int i = 0; i < 5; i++) {

	number[i] = scanner.nextInt();

	sum += number[i];

	if (numbers[i] > 0){
		countPos++;
		sumNonPos += numbers[i];

	}

else {

countNonPos++;
sumNonPos += numbers[i];


}
}


// Calculate the average of positive, non positive and all numbers
double avgPos = (countPos > 0) ? (double) sumPos / countPos : 0.00; // Avoid division by zero
        double avgNonPos = (countNonPos > 0) ? (double) sumNonPos / countNonPos : 0.00; // Avoid division by zero
        double avg = (double) sum / 5; // Average of all numbers

// Output the results: sums and averages
        System.out.printf("The sum of the %d positive number%s: %d%n", countPos, (countPos == 1 ? "" : "s"), sumPos);
        System.out.printf("The sum of the %d non-positive number%s: %d%n", countNonPos, (countNonPos == 1 ? "" : "s"), sumNonPos);
        System.out.printf("The sum of the 5 numbers: %d%n", sum);
        System.out.printf("The average of the %d positive number%s: %.2f%n", countPos, (countPos == 1 ? "" : "s"), avgPos);
        System.out.printf("The average of the %d non-positive number%s: %.2f%n", countNonPos, (countNonPos == 1 ? "" : "s"), avgNonPos);
        System.out.printf("The average of the 5 numbers: %.2f%n", avg);
        
        // Close the scanner object to prevent resource leaks
        scanner.close();















	
	}

}
