package com;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

//Write a Java 8 program to sort a list of employees by their name.
public class SortEmployeeListByTheirName {

    public static void main(String[] args) {
        sortEmployeeListByTheirName();
    }

    private static void sortEmployeeListByTheirName() {

        List<Employee> employeeList = Arrays.asList(
        new Employee("gaurav","cs"),
        new Employee("om","cs"),
        new Employee("ram","cs")
        );

        List<Employee> sortedEmpList = employeeList.stream().sorted((emp1, emp2) -> emp1.getName().compareTo(emp2.getName())).toList();

        sortedEmpList.stream().forEach(employee ->System.out.println(employee.getName()));
    }
}
