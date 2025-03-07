package com.oops.comparable;

import java.util.*;

public class Student implements Comparable<Student> {
    private int id;
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(int age, int id, String name) {
        this.age = age;
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student s) {
        return this.name.compareTo(s.name);
    }

    public static void main(String[] args) {
        List<Student>studentList= Arrays.asList(new Student(25,1,"Ram"),
        new Student(25,1,"Ram"),
                new Student(20,3,"Akash"),
                new Student(29,2,"Hemant")
        );

        Collections.sort(studentList);
        System.out.println(studentList);
    }
}
