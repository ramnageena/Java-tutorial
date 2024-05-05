package com.java8.lambda;
interface  interfaceA{
    void m1();

}
public class LambdaDemo {
    public static void main(String[] args) {
        interfaceA a=()-> System.out.println("Hello, This is Lambda Expression example");
        a.m1();
    }
}
