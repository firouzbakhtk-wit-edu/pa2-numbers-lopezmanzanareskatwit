package edu.wit.cs.comp1000;

import java.util.Scanner;
/**
 * the purpose of this program is to compute the roots of the quadratic formula and to calculate the discriminants
 * 
 * 
 */
public class PA2b {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.print("Enter a b c: ");
	/**
	 * allows user input for variables
	 * 
	 */
        
        double a = sc.nextDouble();
    double b = sc.nextDouble();
        double c = sc.nextDouble();
        
        /**
		 * Calculate discriminant (b^2 - 4ac)
		 * 
		 *  */ 
        double discriminant = (b * b) - (4 * a * c);
        
        if (discriminant > 0) {
            /**
			 * 
			 * two real roots
			 */
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
        double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.printf("Roots: %.2f, %.2f%n", Math.min(root1, root2), Math.max(root1, root2));
        } else if (discriminant == 0) {
            /**
			 * 
			 * one real roots and one double root
			 */
            double root = -b / (2 * a);
            System.out.printf("Root: %.2f%n", root);
        } else {
            /**
			 * 
			 * imaginary roots
			 */
        System.out.println("Roots: imaginary");
        }

        sc.close();
    }
}
