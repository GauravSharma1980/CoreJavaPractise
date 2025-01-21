package com;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//Write a Java 8 program to find the second highest number in a list.
public class SecondHighestNumberInAList {

    public static void main(String[] args) {
        secondHighestNumberInAList();
        secondHighestNumberInAListAnotherWay();


    }

    private static void secondHighestNumberInAListAnotherWay() {
        List<Integer> integerList = Arrays.asList(12,13,4,9,81);
        int value = integerList
        .stream()
                .sorted(Comparator.reverseOrder())
                .distinct()
                .skip(1)
                .findFirst().get();

        System.out.println("the second highest is "+value);
    }

    private static void secondHighestNumberInAList() {
        List<Integer> integerList = Arrays.asList(12,13,4,9,81);
        integerList.sort(Comparator.reverseOrder());
        System.out.println("secondHighest"+integerList.get(1));
    }
}
