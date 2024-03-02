package com.java8;


import java.util.List;
import java.util.stream.Collectors;

public class RemoveStringWIthContainsSomeCondition {
    public static void main(String[] args) {
        //Remove the string those contain "an"
        List<String> fruits = List.of("apple", "banana", "grapes", "orange", "cherry", "date");
        List<String> stringList = fruits.stream().filter(n -> !n.contains("an")).collect(Collectors.toList());
        System.out.println("Removed String based on condition"+stringList);

    }
}
/*
Removed String based on condition[apple, grapes, cherry, date]
 */

