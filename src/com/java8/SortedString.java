package com.java8;

import java.util.List;
import java.util.stream.Collectors;

public class SortedString {
    public static void main(String[] args) {

        List<String> str = List.of("Shubham", "Aman", "Ram", "Akshu", "Nihal");
        List<String> stringList = str.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted List " + stringList);

    }
}
