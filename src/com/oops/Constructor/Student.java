package com.oops.Constructor;

/*
   Constructor :- Constructor name should be same as Class name,
    Constructor are used to analysis the instance of object.

    ------------Type of Constructor---------
    1-Default constructor
    2-Parameter Constructor

 */
public class Student {
    int id;
    String name;
    String city;

    public Student() {
        System.out.println("Default constructor");
    }

    Student(int id, String name, String city){
        System.out.println("Id :"+ " " + id + " Name :" +" "+ name + " City:" +" "+ city);
    }
    Student(int id, String name){
        System.out.println("Id :"+ " " + id + " Name :" +" "+ name );
    }

    public static void main(String[] args) {
        Student s = new Student(1,"Ram","Chennai");
        Student s1 = new Student(1,"Ram");
    }
}
