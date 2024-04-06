package com.InterviewQuestionTricky.IQ2;


class A{
    public A() {
        System.out.println("Class A content");
    }
}
class B extends A{
    public B() {
        System.out.println("Class B content");
    }
}
class C extends B{
    public C() {
        System.out.println("Class C content");
    }
}
public class DemoTest {
    public static void main(String[] args) {
        B b= new C();

    }
}

/*
Class A content
Class B content
Class C content
 */