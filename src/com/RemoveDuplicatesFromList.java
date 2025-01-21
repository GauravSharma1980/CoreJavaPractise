package com;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicatesFromList {

    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("Java","Python","Java");

        stringList = stringList.stream().distinct().toList();

        System.out.println(stringList);

    }
}
