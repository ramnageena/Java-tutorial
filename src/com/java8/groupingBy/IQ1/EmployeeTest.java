package com.java8.groupingBy.IQ1;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeTest {
    private static List<Employee>getAllEmployee(){

        Employee e1= new Employee("Ram","Chennai");
        Employee e2= new Employee("Shubham","Chennai");
        Employee e3= new Employee("Sudhir","Delhi");
        Employee e4= new Employee("Anshu","Bhopal");

        List<Employee>allEmployee= List.of(e1,e2,e3,e4);
        return allEmployee;

    }

    public static void main(String[] args) {
        List<Employee> allEmployee=getAllEmployee();

        Map<String, List<String>> groupingByCity = allEmployee.stream().collect(Collectors.groupingBy(e -> e.getCity(), Collectors.mapping(Employee::getName, Collectors.toList())));

        System.out.println(groupingByCity);
    }











}
