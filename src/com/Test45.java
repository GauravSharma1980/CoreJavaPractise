package com;

import java.util.ArrayList;
import java.util.List;

public class Test45 {

    public static void main(String[] args) {
        List<StringBuilder> list = new ArrayList<>();
        list.add(new StringBuilder("AAA")); //Line n1
        list.add(new StringBuilder("BBB")); //Line n2
        list.add(new StringBuilder("AAA")); //Line n3

        list.removeIf(sb -> sb.equals(new StringBuilder("AAA"))); //Line n4
        System.out.println(list);

        String [] arr = new String[7];
        System.out.println(arr);
    }

}
