package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfElemet {
    public static void main(String[] args) {
        List<Integer> num = List.of(1, 2, 3, 4, 15,5);
        int sum = num.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);


    }
}
