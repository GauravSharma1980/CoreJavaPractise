package com.challenges;

import java.util.Arrays;
import java.util.List;

public class FindAllEvenAndOddNumbersInAList {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(90,23,45,6,2,44);

        integerList.stream().forEach(integer -> {
            if(integer%2==0) {
                System.out.println("Even Number:" + integer);
            }else {
                System.out.println("Odd number" + integer);
            }
        });
    }
}
