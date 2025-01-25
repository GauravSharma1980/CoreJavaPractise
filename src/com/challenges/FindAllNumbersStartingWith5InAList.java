package com.challenges;

import java.util.Arrays;
import java.util.List;

public class FindAllNumbersStartingWith5InAList {
    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(4,3,8,9,5,5,523);

        List<Integer> outList = integerList.stream().filter(num -> num.toString().startsWith("5")).toList();

        System.out.println(outList);
    }
}
