package com.java8;

import java.util.Collections;
import java.util.List;

public class MinimumElement {
    public static void main(String[] args) {
        List<Integer> num = List.of(16, 23, 13, 14, 15,5);
        Integer minElement = num.stream().min((i1, i2) -> i1.compareTo(i2)).get();
        System.out.println("Minimum element :" +minElement);

        // IInd ways
        Integer min = Collections.min(num);
        System.out.println("IInd ways Min element : "+ min);
    }
}
/*
Minimum element :5
IInd ways Min element : 5
 */
