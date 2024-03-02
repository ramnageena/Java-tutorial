package com.java8;

import java.util.List;
import java.util.stream.Collectors;

public class EvenOdd {
    public static void main(String[] args) {
        List<Integer> list = List.of(17, 39, 44, 22, 14, 65, 78, 99);

        List<Integer> even = list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        List<Integer> odd = list.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
        System.out.println("Even number" + even);
        System.out.println("Odd number " + odd);

    }
}
