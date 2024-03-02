package com.java8;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingInDescendingOrder {
    public static void main(String[] args) {
        List<Integer> list = List.of(17, 39, 44, 22, 14, 65, 78, 99);
        List<Integer> sortedList = list.stream().sorted((i1, i2) -> -i1.compareTo(i2)).collect(Collectors.toList());
        System.out.println("Customize reverse order"+sortedList);

        //IInd ways
        List<Integer> sortedList1 = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("IInd Ways to reverse order "+sortedList1);
    }
}
/*
Customize reverse order[99, 78, 65, 44, 39, 22, 17, 14]
IInd Ways to reverse order [99, 78, 65, 44, 39, 22, 17, 14]
 */