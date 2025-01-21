package com;

import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindingDuplicateInList {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(100,200,100);

        Set<Integer> setList = new HashSet<>();

        integerList.stream().forEach( number -> setList.add(number));

        System.out.println(setList);

        findingDuplicatesWithoutUsingSet();
    }

    private static void findingDuplicatesWithoutUsingSet() {

        //List<Integer> integerList = Arrays.asList(23,45,67,23);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 1, 2, 6);
        Map<Integer, Long> duplicates = numbers.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("duplicates::"+duplicates);
        duplicates.entrySet().stream().filter(entry -> entry.getValue() > 1) .forEach(entry -> System.out.println(entry.getKey() + " appears " + entry.getValue() + " times"));


    }
}
