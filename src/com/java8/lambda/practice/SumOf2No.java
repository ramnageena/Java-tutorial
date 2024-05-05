package com.java8.lambda.practice;
interface SumOfTwoNo{
    int sum(int a, int b);
}

public class SumOf2No {
    public static void main(String[] args) {
        SumOfTwoNo sum = (a, b) -> a + b;
        System.out.println("Sum of two  number : " + sum.sum(10, 20));
    }
}
