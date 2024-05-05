package com.java8.lambda;

interface  ReverseInf{
    String reverse(String s);
}
public class Lambda4 {
    public static void main(String[] args) {
        ReverseInf r=s-> {
            String rev = "";
            for (int i = s.length() - 1; i >= 0; i--) {
                rev += s.charAt(i);
            }
            return rev;
        };
        System.out.println("Reverse the String Lambda : "+ r.reverse("Lambda"));
    }
}
