package com;

import java.util.ArrayList;
import java.util.List;

public class TestListFruits {

    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("grape");
        fruits.add("mango");
        fruits.add("banana");
        fruits.add("grape");
        fruits.remove("grape");
        if(true)
            fruits.remove("papaya");

        System.out.println(fruits);
    }
}
