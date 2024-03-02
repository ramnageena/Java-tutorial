package com.java8;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DistinctElement {
    //Remove Duplicate element in the List
    public static void main(String[] args) {
        List<Integer> num = List.of(1, 2, 3, 4, 3, 2, 5, 5);
        List<Integer> list = num.stream().distinct().collect(Collectors.toList());
        System.out.println("Distinct Element"+ list);

        //IInd ways
        Set<Integer> collect = num.stream().collect(Collectors.toSet());
        System.out.println("Unique element"+collect);
    }
}
/*
Distinct Element[1, 2, 3, 4, 5]
Unique element[1, 2, 3, 4, 5]
 */