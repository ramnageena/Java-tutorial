package com.string;

import java.util.Scanner;

public class PallindromString {
    public static void main(String[] args) {
        System.out.println("Please enter the String");
        Scanner sc= new Scanner(System.in);
        boolean flag=true;
        String s=sc.next();

         for(int i=0;i<s.length()/2;i++){
             if(s.charAt(i)!= s.charAt(s.length()-1))
                 flag=false;
             break;
          }
        if(flag){
            System.out.println("String  is Pallindrome");
        }else
            System.out.println("String  is  not Pallindrome");
    }
}
