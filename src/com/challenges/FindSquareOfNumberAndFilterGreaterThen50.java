package com.challenges;

import java.util.Arrays;
import java.util.List;

public class FindSquareOfNumberAndFilterGreaterThen50 {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(2,3,7,9,8,12);

        integerList.stream().filter(number -> number*number>50).forEach(System.out::println);
    }
}
