package com.number;

public class PrimeNumber {
    public static void main(String[] args) {
        int f=10;
        int s=10;
        for(int i=1;i<=20;i++){
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    System.out.println("Not Prime"+i);
                }
                else
                    System.out.println("Prime"+ i);
            }
        }

    }
}
