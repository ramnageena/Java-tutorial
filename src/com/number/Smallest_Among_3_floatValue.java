package com.number;

import java.util.Scanner;

public class Smallest_Among_3_floatValue {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        System.out.println("Enter the 1st number : ");
        float a = s.nextFloat();
        System.out.println("Enter the 2nd number : ");
        float b = s.nextFloat();
        System.out.println("Enter the 3rd number : ");
        float c = s.nextFloat();

        if (a < b && b < c) {
            System.out.println("The Smallest number is A :" + a);
        } else if (b <c) {
            System.out.println("The Smallest number is B :" + b);
        } else
            System.out.println("The Smallest number is  C:" + c);

    }
}
