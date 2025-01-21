package com;

import java.util.Arrays;
import java.util.List;

public class SortListOfStringsByTheirLength {
    public static void main(String[] args) {
        sortListOfStringsByTheirLength();

    }

    private static void sortListOfStringsByTheirLength() {
        List<String> stringList = Arrays.asList("Gaurav","Soham","Leela","kamal","Karn","Ram");
        List<String> sortedList = stringList.stream().sorted((s1, s2) -> Integer.compare(s1.length(), s2.length())).toList();
        System.out.println(sortedList);
    }
}
