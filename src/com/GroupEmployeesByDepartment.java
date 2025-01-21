package com;

//Write a Java 8 program to group a list of employees by department


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

class Employee{
    private String name;
    private String departmentName;

    public Employee(String name, String departmentName) {
        this.name = name;
        this.departmentName = departmentName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
public class GroupEmployeesByDepartment {

    public static void main(String[] args) {

        groupEmployeesByDepartment();
    }

    private static void groupEmployeesByDepartment() {


        List<Employee> employeeList = Arrays.asList(
        new Employee("gaurav","computer"),
        new Employee("soham","medical"),
        new Employee("sukhi","medical"),
        new Employee("ram","astronomy"),
        new Employee("shyam","computer")
        );

        Map<String, List<Employee>> mapEmployee = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartmentName));

        mapEmployee.forEach((department, employeesInTheDepartment) -> {
            employeesInTheDepartment.stream().forEach(employee -> {
                System.out.println(employee.getName()+"::"+employee.getDepartmentName());
            });
        });
    }
}

