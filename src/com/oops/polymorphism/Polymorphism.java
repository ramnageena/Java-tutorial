package com.oops.polymorphism;
/*
Polymorphism:- Polymorphism can we achieve by using method overloading and method overriding.
Best example for Method Overriding
 */

class Bank{
    void rateOfInterest(){
        System.out.println("RBI Bank Rate of Interest is 5%");
    }
}
class  SBI extends  Bank{
    void rateOfInterest(){
        System.out.println("SBI Bank Rate of Interest is 5.5%");
    }
}
class  HDFC extends  Bank{
    void rateOfInterest(){
        System.out.println("HDFC Bank Rate of Interest is 6.5%");
    }
}
class  CITI extends  Bank{
    void rateOfInterest(){
        System.out.println("CITI Bank Rate of Interest is 7.5%");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        SBI sbi= new SBI();
        sbi.rateOfInterest();
        HDFC hdfc= new HDFC();
        hdfc.rateOfInterest();
        CITI citi= new CITI();
        citi.rateOfInterest();
        Bank bank= new Bank();
        bank.rateOfInterest();
    }
}
/*
SBI Bank Rate of Interest is 5.5%
HDFC Bank Rate of Interest is 6.5%
CITI Bank Rate of Interest is 7.5%
RBI Bank Rate of Interest is 5%
 */