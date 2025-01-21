package com;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TotalOccurancesOfChars {

    public static void main(String[] args) {

        String name = "Gaurav";

        Map<Character, Long> collect = name.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        collect.forEach((key,value)-> System.out.println(key +"**"+value));
    }
}
