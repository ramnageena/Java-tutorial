package com.number;
/*
input = 6
A perfect number is a positive integer that is equal to the sum of its proper divisors, excluding itself.
 For example, 6 is a perfect number because its divisors are 1, 2, and 3, and 1 + 2 + 3 = 6.
 */

import java.util.Scanner;

public class Perfect_Number {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = s.nextInt();
        boolean perfectNumber=isPerfectNumber(n);
        if (perfectNumber){
            System.out.println("The given number "+ n+ " is perfect number");
        }else
            System.out.println("The given number "+ n+ " is not perfect number");
    }
    static  boolean isPerfectNumber(int x){
        int t=x;
        int sum=0;
        for (int i=1;i<=x/2;i++){
            if (x%i==0){
                sum+=i;
            }
        }
         return sum==t;
    }
}
