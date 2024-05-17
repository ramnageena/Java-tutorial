package com.number;

import java.util.Scanner;

/*
Inputs:
  num= 3

output:
    output = 1*1 + 2*2 +3*3

 */
public class Sum_of_squares_of_the_first_N_natural {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = s.nextInt();
        int sumOfSquare=0;
        for(int i=1;i<=num;i++){
            sumOfSquare+=i*i;
        }
        System.out.println("Sum of Square of num : "+ num +" is : "+ sumOfSquare );
    }
}
