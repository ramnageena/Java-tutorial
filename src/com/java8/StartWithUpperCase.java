package com.java8;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StartWithUpperCase {
    public static void main(String[] args) {
        //Find the String those start with Upper Case
        List<String> str = List.of("Ram", "Hanuman", "sita", "lakshman", "bharat");
        List<String> upperCase = str.stream().filter(s -> Character.isUpperCase(s.charAt(0))).collect(Collectors.toList());
        System.out.println("String Start with Upper case "+ upperCase);

        //Find the String those start with Lower Case
        List<String> lowerCase = str.stream().filter(s -> Character.isLowerCase(s.charAt(0))).collect(Collectors.toList());
        System.out.println("String Start with Lower case "+ lowerCase);

        //IInd ways

        Map<Boolean, List<String>> listMap = str.stream().collect(Collectors.partitioningBy(s -> Character.isUpperCase(s.charAt(0))));
        System.out.println("String Start with Upper case "+ listMap.get(true));
        System.out.println("String Start with Lower case "+ listMap.get(false));


    }
}
