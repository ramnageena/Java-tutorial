package com.java8;

import java.util.List;
import java.util.stream.Collectors;

public class FindStringWithGreaterThanSomeLength {
    // Find the String those who has less than or equal to 5 character
    public static void main(String[] args) {
        List<String> str = List.of("Rajesh", "Vignesh", "Shubham", "Ram", "Akshu", "Raju");
        List<String> stringList = str.stream().filter(n -> n.length() <= 5).collect(Collectors.toList());
        System.out.println("String Less than or eqauls to 5"+stringList);
    }
}
