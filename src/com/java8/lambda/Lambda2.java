package com.java8.lambda;

interface  MyInterface{
    double getPiValue();

}
public class Lambda2 {
    public static void main(String[] args) {
        MyInterface inf= ()-> 3.14;
        double piValue = inf.getPiValue();
        System.out.println(" Value of Pi value: " +piValue);
    }
}
