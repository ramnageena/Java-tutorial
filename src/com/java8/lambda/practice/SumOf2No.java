package com.java8.lambda.practice;
interface SumOfTwoNo{
    int sum(int a, int b);
}

public class SumOf2No {
    public static void main(String[] args) {
        SumOfTwoNo s = (a, b) -> a + b;
        System.out.println("Sum of two  number : " + s.sum(10, 20));
    }
}
