package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BasicJava8 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,3,4,2,5);

        //multiply by 2 for even number
        List<Integer> collect = list.stream().filter(n -> n % 2 == 0).map(x -> x * 2).collect(Collectors.toList());
        System.out.println(collect);
    }
}
