package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;
import java.util.stream.IntStream;

//Write a Java 8 program to filter even numbers from a list.
public class FilterEvenNumberFromList {

    public static void main(String[] args) {

        filterEvenNumbersFromList();
    }

    private static void filterEvenNumbersFromList() {
        List <Integer>intList = Arrays.asList(10,20,3,5,19);
        intList.stream().filter(number -> number%2==0).forEach(System.out::println);

        intList.stream().filter(number -> number%2==0).forEach(System.out::println);


    }
}
