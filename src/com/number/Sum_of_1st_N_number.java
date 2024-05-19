package com.number;

import java.util.Scanner;

public class Sum_of_1st_N_number {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = s.nextInt();

        int sum=0;
        //using for loop
//        for (int i=1;i<=n;i++){
//        sum+=i;
//        }

        //using while
        int i=1;
        while (i<=n){
            sum+=i;
            i++;
        }
        System.out.println("Sum of 1st N number : " + sum);

    }
}