package com.java8;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortedNumber {
    public static void main(String[] args) {
        List<Integer> num = List.of(51, 12, 36, 41, 15,5);
        List<Integer> sortedList = num.stream().sorted().collect(Collectors.toList());
        System.out.println("Natural order sorted list :"+sortedList);
    }
}
///Natural order sorted list :[5, 12, 15, 36, 41, 51]