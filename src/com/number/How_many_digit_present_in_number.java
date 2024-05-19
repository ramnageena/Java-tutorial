package com.number;

import java.util.Scanner;

/*
 input = 1345
 output =4

 logic:-
     int a =n%1o; ==5
     cout++;
     n=n/10;
 */
public class How_many_digit_present_in_number {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n =s.nextInt();
        int count=0;
        while (n>0){
            n= n/10;
            count++;
        }
        System.out.println(count);

    }
}
