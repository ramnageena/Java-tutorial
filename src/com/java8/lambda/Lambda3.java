package com.java8.lambda;
interface  MyInterface1{
    int getLength(String s);
    
}
public class Lambda3 {
    public static void main(String[] args) {
        MyInterface1 i= s->s.length();
        System.out.println("Length of Given String :" + i.getLength("My Name is Ram"));

    }
    
}
