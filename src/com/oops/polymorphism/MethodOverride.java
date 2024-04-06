package com.oops.polymorphism;

class Vehicle{
    String vehicleName;
    int noOfTyers;

    void run(String vehicleName,int noOfTyers){
        System.out.println("Run method in Vehicle");
    }
}
class Car extends  Vehicle{

    String vehicleName;
    int noOfTyers;

    void run(String vehicleName,int noOfTyers){
        System.out.println("Run method in Car");
    }
}
class MethodOverride {
    public static void main(String[] args) {
        Car c= new Car();
        c.run("Audi",4);
    }
}
