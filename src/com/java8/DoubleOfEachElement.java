package com.java8;

import java.util.List;
import java.util.stream.Collectors;

public class DoubleOfEachElement {
    public static void main(String[] args) {

        List<Integer> num = List.of(1, 2, 3, 4, 15,5);
        List<Integer> list = num.stream().map(n -> n * n).collect(Collectors.toList());
        System.out.println("Double of Each Element "+ list);
    }
}
//Double of Each Element [1, 4, 9, 16, 225, 25]