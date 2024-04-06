package com.oops.polymorphism;

public class MethodOverloading {
     int id;
    int age;
    String name;
    public int sum(int id, int age){
        this.id=id;
        this.age=age;
        System.out.println("Id= " + id + " Age= " +age);
        return id+age;
    }
    public int sum(int id, int age,String name){
        this.id=id;
        this.age=age;
        this.name=name;
        System.out.println("Id=" +" "+ id + " Age=" + " "+ age + " Name=" + " "+ name);
        return id+age;
    }
    public String sum(int id,String name){
        this.id=id;
        this.name= name;
        System.out.println("Id= "+ id + " Name= " + name);
        return name;
    }

    public static void main(String[] args) {
        MethodOverloading m= new MethodOverloading();
        m.sum(1,22);
        m.sum(2,23,"Ram");
        m.sum(202,"Ganesh");
    }
}
