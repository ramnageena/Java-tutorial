package com.string;

public class ReverseString {
    public static void main(String[] args) {
        String s= "My name is Ram";
        String rev="";
        char[] str = s.toCharArray();
        for(int i=str.length-1;i>=0;i--){
            rev+= str[i];
        }
        System.out.println("Reversed String: " + rev);
    }
}
