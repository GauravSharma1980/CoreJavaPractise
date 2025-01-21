package com;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindingDuplicateInList {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(100,200,100);

        Set<Integer> setList = new HashSet<>();

        integerList.stream().forEach( number -> setList.add(number));

        System.out.println(setList);
    }
}
