package com.number;

import java.util.Scanner;

/*
  input : 1234
  output  : 1*1 + 2*2 + 3*3 + 4*4 == 30
 */
public class Sum_of_sqaure_of_Digit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = s.nextInt();

        int sum=0;
        while (n>0){
            int r=n%10;
            sum+=r*r;
            n=n/10;
        }
        System.out.println(sum);
    }
}
