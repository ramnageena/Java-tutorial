package com.EmployeePayrollProject;

import java.util.ArrayList;
import java.util.EnumMap;

abstract class Employee{
    private  int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                "salary=" +  calculateSalary() +
                '}';
    }

    abstract  double calculateSalary();

}

class FullTimeEmployee extends  Employee{
    private  double hourlyRate;

    public FullTimeEmployee(int id, String name,double hourlyRate) {
        super(id, name);
        this.hourlyRate=hourlyRate;
    }
    @Override
    double calculateSalary() {
        return hourlyRate;
    }
}

class PartTimeEmployee extends  Employee{
    private int hourWorked;
    private double hourlyRate;

    public PartTimeEmployee(int id, String name,int hourWorked,double hourlyRate) {
        super(id, name);
        this.hourWorked=hourWorked;
        this.hourlyRate=hourlyRate;
    }

    @Override
    double calculateSalary() {
        return hourWorked*hourlyRate;
    }
}
class PayrollSystem{
    private ArrayList<Employee> employeeList;

    public PayrollSystem() {
        employeeList =  new ArrayList<>();
    }
    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }
    public void removeEmployee(int id){
        Employee employeeToRemove= null;
        for(Employee employee:employeeList){
            if(employee.getId()==id){
                employeeToRemove=employee;
                break;
            }

        }
        if (employeeToRemove!=null){
            employeeList.remove(employeeToRemove);
        }
    }
    public void displayEmployees(){
        for(Employee employee:employeeList){
            System.out.println(employee);
        }
    }
}

public class ClientTest {
    public static void main(String[] args) {
        PayrollSystem payrollSystem= new PayrollSystem();
        FullTimeEmployee emp1= new FullTimeEmployee(1,"Ram",35000.0);
        PartTimeEmployee emp2= new PartTimeEmployee(2,"Sudhir",8,100);

        payrollSystem.addEmployee(emp1);
        payrollSystem.addEmployee(emp2);
        System.out.println("Initial Employee Details: ");
        payrollSystem.displayEmployees();
        payrollSystem.removeEmployee(2);
        System.out.println("Remaining Employee Details: ");
        payrollSystem.displayEmployees();

    }
}
