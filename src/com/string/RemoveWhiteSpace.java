package com.string;

public class RemoveWhiteSpace {
    public static void main(String[] args) {
        String str="    I     am    Ram";

        String s = str.replaceAll("\\s", "");
        System.out.println(s);
    }
}
