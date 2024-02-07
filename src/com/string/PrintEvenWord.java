package com.string;

public class PrintEvenWord {
    public static void main(String[] args) {
        String s=" Sun rise in the East";
        String[] s1 = s.split(" ");
       for(String d:s1){
           if(d.length() %2==0){
               System.out.println(d);
           }
       }


    }
}
