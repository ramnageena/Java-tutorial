package com.number;

import java.util.Scanner;

public class PerfectNumber_withMethod {
    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n= s.nextInt();
        boolean perfectNumber= isPerfectNumber(n);
        if(perfectNumber){
            System.out.println(n+" Number is Perfect Number");
        }else
            System.out.println(n+" Number is Not Perfect Number");
    }

    static  boolean isPerfectNumber(int n){
        int sum=0;
        int temp=n;
        for(int i=1;i<n;i++){
            if (n%i==0){
                sum+=i;
            }
        }
        return temp==sum;
    }
}
