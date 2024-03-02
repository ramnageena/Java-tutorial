package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfElemet {
    public static void main(String[] args) {
        List<Integer> num = List.of(1, 2, 3, 4, 15,5);
        int sum = num.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum of all Element :"+sum);

        //IInd ways
        int sum1 = num.stream().mapToInt(i -> i).sum();
        System.out.println("IInd ways Sum of all Element :"+sum1);
    }
}
/*
Sum of all Element :30
IInd ways Sum of all Element :30
 */