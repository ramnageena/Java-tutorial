package com.string;

import java.util.Scanner;

public class Count_Vowels_Consonent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s1 = sc.nextLine();
        String s = s1.toLowerCase().replaceAll("\\s", "");
        String v = "";
        String c = "";
        int vcount = 0;
        int ccount = 0;
        String invalid = " ";
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                v += s.charAt(i) + " ";
                vcount++;

            } else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                c += s.charAt(i) + " ";
                ccount++;

            } else {
                invalid += s.charAt(i);
            }

        }
        System.out.println("Vowels are :" + v + " count of vowels : " + vcount);
        System.out.println("Vowels are :" + c + " count of vowels : " + ccount);
        System.out.println("Invalid Character");

    }
}
