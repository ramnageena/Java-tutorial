package com.number;

import java.util.Scanner;

public class Integer_is_Number_Or_Digit {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the Integer value");
        int in = s.nextInt();

        // 1 way
        if(in/10==0){
            System.out.println("The Integer value is Digit");
        }else
            System.out.println("The Integer value is Number");

        // 2 ways
        if(in<10 && in>-10){
            System.out.println("The Integer value is Digit");
        }else
            System.out.println("The Integer value is Number");

    }
}
