package com.number;

import java.util.Scanner;

/*
  input = 145
  output = 1! + 4!+ 5! ==145 is called string number

 */
public class Strong_Number {
        public static void main(String[] args) {
            // Create a Scanner object to read input from the user
            Scanner scanner = new Scanner(System.in);

            // Prompt the user to enter a number
            System.out.println("Enter the number: ");
            int number = scanner.nextInt();

            // Check if the entered number is a Strong number
            boolean isStrongNumber = isStrong(number);

            // Display the result
            if (isStrongNumber) {
                System.out.println(number + " is a Strong number.");
            } else {
                System.out.println(number + " is not a Strong number.");
            }
        }

        // Method to check if a number is a Strong number
        static boolean isStrong(int number) {
            int originalNumber = number; // Store the original number
            int sum = 0; // Initialize sum of factorials

            // Loop to calculate the sum of factorials of each digit
            while (number != 0) {
                int digit = number % 10; // Extract the last digit
                sum += factorial(digit); // Add the factorial of the digit to sum
                number /= 10; // Remove the last digit
            }

            // Check if the sum of factorials is equal to the original number
            return sum == originalNumber;
        }

        // Method to calculate the factorial of a number
        static int factorial(int n) {
            int result = 1; // Initialize result to 1
            for (int i = 2; i <= n; i++) { // Loop to calculate factorial
                result *= i;
            }
            return result; // Return the factorial
        }
    }

