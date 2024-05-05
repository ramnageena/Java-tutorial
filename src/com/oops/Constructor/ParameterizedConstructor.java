package com.oops.Constructor;
/*
  
 */
 class Beer{
     String brandName;
     int price;

     public Beer() {
         System.out.println("Default Beer Constructor");
     }
     public  Beer(int price,String brandName){
         this.price=price;
         this.brandName=brandName;
     }
     public  void display(){
         System.out.println("Beer price: "+price);
         System.out.println("Beer brandName: "+brandName);
     }
 }

 class Beer1 extends Beer{
     int quantity;

     public Beer1() {
         System.out.println("Default Beer1 constructor");
     }

     public Beer1(int price, String brandName, int quantity) {
         super(price, brandName);
         this.quantity = quantity;

     }
     public  void display(){
         System.out.println("Beer1 price: "+price);
         System.out.println("Beer1 brandName: "+brandName);
         System.out.println("Beer1 quantity: "+quantity);
     }
 }

public class ParameterizedConstructor {
    public static void main(String[] args) {
        Beer b= new Beer();
        System.out.println("Default value of brandName: " + b.brandName);
        System.out.println("Default value of price: " + b.price);
        Beer beer= new Beer(180,"KingFisher");
        beer.display();

        Beer1 beer1= new Beer1();
        System.out.println("Default value of brandName: " + beer1.brandName);
        System.out.println("Default value of price: " + beer1.price);
        System.out.println("Default value of price: " + beer1.quantity);
        Beer1 beer11= new Beer1(150,"BroCode",350);
        beer11.display();


    }
}
/*

Default Beer Constructor
Default value of brandName: null
Default value of price: 0
Beer price: 180
Beer brandName: KingFisher
Default Beer Constructor
Default Beer1 constructor
Default value of brandName: null
Default value of price: 0
Default value of price: 0
Beer1 price: 150
Beer1 brandName: BroCode
Beer1 quantity: 350

 */