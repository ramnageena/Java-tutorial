package com.java8;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupListElementByLength {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("apple", "banana", "cherry", "date", "grape");
        Map<Integer, List<String>> listMap = str.stream().collect(Collectors.groupingBy(String::length));
        System.out.println("Group Element by Length"+listMap);
        Map<Integer, List<String>> listMap1 = str.stream().collect(Collectors.groupingBy(s->s.length()));
        System.out.println("IInd ways Group Element by Length"+listMap1);
    }
}

/*
Group Element by Length{4=[date], 5=[apple, grape], 6=[banana, cherry]}
IInd ways Group Element by Length{4=[date], 5=[apple, grape], 6=[banana, cherry]}
 */
