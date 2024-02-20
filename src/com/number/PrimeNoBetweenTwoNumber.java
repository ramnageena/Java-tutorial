package com.number;

import java.util.Scanner;

public class PrimeNoBetweenTwoNumber {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the First number");
        int first = s.nextInt();
        System.out.println("Enter the First number");
        int sec = s.nextInt();
        System.out.printf("\nPrime numbers between %d and %d are: ", first, sec);

        if (first < sec) {
            for (int i = first; i <= sec; i++) {
                int count = 0;
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        count = 1;
                        break;
                    }
                }
                if (count == 0) {
                    System.out.print(i + " ");
                }
            }

        } else
            System.out.println("First number should be smaller then larger");
    }
}
