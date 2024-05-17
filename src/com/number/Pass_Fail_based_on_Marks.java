package com.number;

import java.util.Scanner;

public class Pass_Fail_based_on_Marks {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the math number : ");
        int math = s.nextInt();
        System.out.println("Enter the science number : ");
        int science = s.nextInt();
        System.out.println("Enter the english number : ");
        int english = s.nextInt();
        System.out.println("Enter the hindi number : ");
        int hindi = s.nextInt();

    if (math>35||science>35 ||english>35||hindi>35) {
        System.out.println("Pass!!!!");
    }else
        System.out.println("Fail !!!");
       }
}
