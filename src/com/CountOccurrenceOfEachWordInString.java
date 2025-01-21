package com;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class CountOccurrenceOfEachWordInString {

    public static void main(String[] args) {

        countWordInAString();

    }

    private static void countWordInAString() {
        String str = "Hello my name is Gaurav and your name is ??";
        Map<String, Long> collect = Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(word -> word, Collectors.counting()));
        System.out.println(collect);
    }
}
