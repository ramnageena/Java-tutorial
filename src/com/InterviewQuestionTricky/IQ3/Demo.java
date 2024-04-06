package com.InterviewQuestionTricky.IQ3;
/*
We have 3 classes A,B,C
and all 3 classes has add() methods so is there any ways to call A's methods from class C?
--Yes we have ways , we need to add super.add() method in  class B and class C
 */

class A{
    public void add(){
        System.out.println("Class A methods");
    }
}
class B extends A{
    public void add(){
        super.add();
        System.out.println("Class B methods");
    }
}
class C extends  B{
    public void add(){
        super.add();
        System.out.println("Class C methods");
    }
}

public class Demo {
    public static void main(String[] args) {
         B c= new C();
         c.add();
    }
}
/*
Class A methods
Class B methods
Class C methods
 */