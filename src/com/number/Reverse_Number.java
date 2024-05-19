package com.number;

import java.util.Scanner;

/*
input : 12345
output : 54321
 */
public class Reverse_Number {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n=s.nextInt();
        int originalNumber =n; // for printing the original value
        int rev=0;
        while(n>0){
            int r=n%10;
            rev=rev*10+r;
            n=n/10;
         }

         System.out.println("The orignal number is " +originalNumber+ " and reverse number is : "+rev);
    }
}
