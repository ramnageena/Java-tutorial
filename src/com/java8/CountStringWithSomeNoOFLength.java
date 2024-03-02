package com.java8;

import java.util.List;

public class CountStringWithSomeNoOFLength {
    public static void main(String[] args) {
        List<String> str = List.of("Rajesh", "Vignesh", "Shubham", "Ram", "Akshu", "Raju");
        long count = str.stream().filter(s -> s.length() > 5).count();
        System.out.println("Number of String those have more than 5 Char = " +count);
    }
}
