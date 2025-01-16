package com;

import java.util.ArrayList;
import java.util.List;

public class StringBuilderEx {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hello");
        List<StringBuilder> list = new ArrayList<>();
        list.add(sb);
        list.add(new StringBuilder("Hello"));
        list.add(sb);
        sb.append("World!");

        System.out.println(list);

        extractInt(2.7);
        extractInt(2.0);
    }
        private static void extractInt(Double obj) {
            System.out.println(obj.intValue());
        }
}
