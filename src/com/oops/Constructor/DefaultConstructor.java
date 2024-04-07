package com.oops.Constructor;


/*
Default Constructor:- Default constructor is an implicit constructor,
                      which is created by compiler.
 Default Constructor is used to initialization the instance variable with default value
  at the time of object creation.

If we are not defining any constructor in class then compiler will create default constructor internally
or if we define any constructor then compiler will not create default constructor.
 */

class Employee{
    int id;
    String name;
    String city;

    /*
    If we are not defining any constructor in class
    then compiler will create default constructor internally like below and initialization the default value

    public Employee() {
         id=0;
         name=null;
         city=null;
    }

     */


}
public class DefaultConstructor {


    public static void main(String[] args) {
        Employee emp= new Employee();
        System.out.println(emp.id);  //0
        System.out.println(emp.name); //null
        System.out.println(emp.city); //null


    }
}
