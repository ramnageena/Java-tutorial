package com.number;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        System.out.println("Enter the number : ");
        int n=s.nextInt();
        int result=1;
        for (int i=1;i<=n;i++){
            result=result*i;
        }
        System.out.println("Factorail of "+ n +" is :"+ result);
    }
}
