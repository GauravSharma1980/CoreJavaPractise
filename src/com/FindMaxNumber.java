package com;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindMaxNumber {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,9,10);

        int maxValue = integerList.stream().max(Comparator.naturalOrder()).get();

        System.out.println(maxValue);

        maxValue = integerList.stream().max(Integer::compareTo).get();


        System.out.println(maxValue);
    }
}
