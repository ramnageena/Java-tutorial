package com.number;

import java.util.Scanner;

/*
  inpyt : 1234
  output : 1+2+3+4 = 10
 */
public class Sum_of_Digit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = s.nextInt();
        int sumOfDigit = isSumOfDigit(n);
        System.out.println("Sum of digit is :" + sumOfDigit);
    }
    //with static method
    static int isSumOfDigit(int r){
        int s=0;
        while (r>0){
            int a= r%10;
            s+=a;
            r=r/10;
        }
        return s;
    }
/*
        ----with simple logic----

        int sumOfDigit=0;
        while (n>0){
            int res=n%10;
            sumOfDigit+=res;
            n=n/10;
        }
        System.out.println("Sum of digit is :"+sumOfDigit);
*/




    }


