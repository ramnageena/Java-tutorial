package com.java8.groupingBy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentTest {
    public static void main(String[] args) {

        Student s1 = new Student("01", "Ram", 25, new int[]{87, 90, 98, 95});
        Student s2 = new Student("02", "Akshu", 25, new int[]{87, 90, 98, 95});
        Student s3 = new Student("03", "Ravi", 32, new int[]{87, 90, 98, 95});
        Student s4 = new Student("04", "Shubham", 27, new int[]{87, 90, 98, 95});
        Student s5 = new Student("05", "Pranali", 27, new int[]{87, 90, 98, 95});
        Student s6 = new Student("06", "Reshma", 28, new int[]{87, 90, 98, 95});
        Student s7 = new Student("07", "Ashish", 28, new int[]{87, 90, 98, 95});
        Student s8 = new Student("08", "Hemant", 25, new int[]{87, 90, 98, 95});
        List<Student> allStudent = List.of(s1, s2, s3, s4, s5, s6, s7, s8);

        //For Check particular value is existing or not
        allStudent.stream().filter(i -> i.getName().contains("Akshu")).collect(Collectors.toList()).forEach(System.out::println);

        //For Grouping the Object based on Age
        Map<Integer, List<Student>> groupingByAge = allStudent.stream().collect(Collectors.groupingBy(st -> st.getAge()));
        System.out.println(groupingByAge);

        //For Grouping the Object based on Age
        Map<String, List<Student>> groupingByName = allStudent.stream().collect(Collectors.groupingBy(s -> s.getName()));
        System.out.println(groupingByName);

        // we want to group the object , but we want to get only name instead of all the List
        Map<Integer, List<String>> listMap = allStudent.stream().collect(Collectors.groupingBy(st -> st.getAge(), Collectors.mapping(Student::getName, Collectors.toList())));
        System.out.println(listMap);

          // we want to group the object based on age and print the Student those hase more tha 25 years pf age , but we want to get only name instead of all the List
        Map<Boolean, List<String>> listMap1 = allStudent.stream().collect(Collectors.partitioningBy(st -> st.getAge() > 25, Collectors.mapping(Student::getName, Collectors.toList())));
        System.out.println(listMap1);

        //to get All unique age without duplicate
        List<Integer> collect = allStudent.stream().map(Student::getAge).distinct().collect(Collectors.toList());
        System.out.println("Unique Age: "+collect);
    }
}
