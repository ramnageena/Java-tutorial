package com.string;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1="The videos of Miley Cyrus";
        String s2="Miss they fled your voice";

        if(s1.length()!=s2.length()){
            System.out.println("Both the string length are not same thats why it's not a Anagram");
        }else{
            // firstly converting  string to lowerCase then to Character Array
            char[] str1 = s1.replaceAll("\\s","").toLowerCase().toCharArray();
            char[] str2 = s2.replaceAll("\\s","").toLowerCase().toCharArray();

            //sorting the char[] array
            Arrays.sort(str1);
            Arrays.sort(str2);

            if(Arrays.equals(str1,str2)==true){
                System.out.println("Both the String are Anagram");
            }
            else
                System.out.println("Both the String are not Anagram");
        }
    }
}

