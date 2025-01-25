package com.challenges;

import java.util.Arrays;
import java.util.List;

public class FindFirstElementOfList {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(34,56,76,89,97);

        findTheFirstElementOfTheList(integerList);
    }

    private static void findTheFirstElementOfTheList(List<Integer> integerList) {

        System.out.println("the first integer value is "+ integerList.stream().findFirst());
    }
}
