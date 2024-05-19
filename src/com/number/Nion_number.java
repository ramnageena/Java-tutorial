package com.number;

import java.util.Scanner;

/*
 input =9
 output : 9*9 = 81 : 8+1 ==9
 */
public class Nion_number {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = s.nextInt();
        boolean nion_number=isNionNumber(n);
        if (nion_number){
            System.out.println("The given number "+ n+ " is Nion number");
        }else
            System.out.println("The given number "+ n+ " is not Nion number");
    }
    static  boolean isNionNumber(int x){
        int a= x*x;
        int sum=0;
        while (a>0){
            int i=a%10;
            sum+=i;
            a=a/10;
        }
        return x==sum;
    }
     /*
     -------------------with simple--------------
     int sq=n*n;
     int sum=0;
     while(sq>0){
          int r= sq%10;
          sum+=r;
          sq=sq/10;

       if(sum==n){
            System.out.println("The given number "+ n+ " is Nion number");
        }else
            System.out.println("The given number "+ n+ " is not Nion number");
      }*/
    }


