import java.io.*;
import java.util.Scanner;

class HornerAlgorithm {

    // Driver program
    public static void main (String[] args) {

        Scanner scnr = new Scanner(System.in);

        // Prompt the user for the degree n
        System.out.print("What is the highest degree n: ");
        int degreeN = scnr.nextInt();

        // Prompt the user for the value of x
        System.out.print("What is the value of x: ");
        // Assign value of x to double variable
        double xVal = scnr.nextDouble();


        // Declare array for coefficients
        double[] coeff = new double[degreeN + 1];
        // Prompt the user for the coefficient values
        System.out.print("What are the coefficient values starting from left to right separated by spaces: ");
        // Place coefficients into array
        for (int i = 0; i < coeff.length; i++) {

            // Place next scanned coefficient into array at index i
            coeff[i] = scnr.nextDouble();
        }

        // Declare answer variable for the solution of polynomial
        double answer = 0;

        // Create enhanced for loop to iterate through coefficient array, setting i as coeff
        for (double i : coeff) {

            // Use Horner's Algorithm at index i of coeff array
            answer = answer * xVal + i;
        }

        // Print solution to screen for the user to see
        System.out.println("The polynomial final result is " + answer);

    }
}