package com;

import java.util.Arrays;
import java.util.stream.Collectors;

public class JoinAListOfStringsWithDelimetir {

    public static void main(String[] args) {

        joinAListOfStringsWithDelimetir();
    }

    private static void joinAListOfStringsWithDelimetir() {

        String collect = Arrays.asList("gaurav", "soham", "karna", "govind").stream().collect(Collectors.joining(","));

        System.out.println(collect);

    }
}
