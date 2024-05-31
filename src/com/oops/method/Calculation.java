package com.oops.method;

public class Calculation {
    void sum(int a, int b){
        System.out.println(a+b);
    }
    int sum(int a,int b,int c){

        return a+b+c;
    }

    public static void main(String[] args) {
        Calculation c= new Calculation();
        c.sum(10,20);
        int sum = c.sum(10, 20, 30);
        System.out.println(sum);
    }
}
