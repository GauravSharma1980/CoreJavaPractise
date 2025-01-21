package com;

import java.util.Arrays;
import java.util.List;

public class SumOfIntegerList {
    public static void main(String[] args) {
        calculateSumOfIntValues();
    }

    private static void calculateSumOfIntValues() {
        List<Integer> integerList = Arrays.asList(10,20,30);
        int sum = integerList.stream().reduce((num1, num2) -> (num1+num2) ).get();
        System.out.println("the sum of values is:: "+sum);
        sum = integerList.stream().reduce(0,Integer::sum);
        System.out.println("the sum of values is:: "+sum);

    }
}
