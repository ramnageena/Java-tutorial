package com.string;

public class Reverse_Words {
    public static void main(String[] args) {
        String str= "My name is Ram";
        String[] ch = str.split("\\s");
        String temp="";

        for (int i =ch.length-1;i>=0;i--){
            temp+=ch[i]+" ";
        }
        System.out.println(temp);
    }
}
