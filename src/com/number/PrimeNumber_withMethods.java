package com.number;

import java.util.Scanner;

public class PrimeNumber_withMethods {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n= s.nextInt();
        boolean primeNumber= isPrimeNumber(n);
        if(primeNumber){
            System.out.println(n+"Number is Prime Number");
        }else
            System.out.println(n+" Number is Not Prime Number");
    }
    static boolean isPrimeNumber(int x){
        for (int i=2;i<=x/2;i++){
            if (x%i==0)
                return  false;
        } return  true;
    }
}
