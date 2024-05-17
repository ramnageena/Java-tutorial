package com.number;

import java.util.Scanner;

public class Biggest_Among_3_Number {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the 1st number : ");
        int a = s.nextInt();
        System.out.println("Enter the 2nd number : ");
        int b = s.nextInt(); System.out.println("Enter the 3rd number : ");
        int c = s.nextInt();

        if(a>b && b>c){
            System.out.println("The biggest number is A :" +a);
        } else if (b>c) {
                System.out.println("The biggest number is B :" +b);
            }
        else
            System.out.println("The biggest number is  C:" +c);

    }
}
