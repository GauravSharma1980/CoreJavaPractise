package com.challenges;

import java.util.Arrays;

public class SortArrayAndConvertIntoStream {

    public static void main(String[] args) {
        int num[] = new int[]{7,49,31,54,90,10};
        Arrays.sort(num);
        Arrays.stream(num).forEach(System.out::println);
    }
}
