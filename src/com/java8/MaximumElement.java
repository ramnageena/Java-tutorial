package com.java8;

import java.util.Collections;
import java.util.List;

public class MaximumElement {
    public static void main(String[] args) {
        List<Integer> num = List.of(16, 23, 13, 14, 15,5);
        Integer maxElement = num.stream().max((i1, i2) -> i1.compareTo(i2)).get();
        System.out.println("Maximum element :" +maxElement);

        // IInd ways
        Integer max = Collections.max(num);
        System.out.println("IInd ways  Max element: " +max );

    }
}
/*
Maximum element :23
IInd ways  Max element: 23
 */