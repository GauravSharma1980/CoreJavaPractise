package com;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Apple {
    public String color;

    public Apple(String color) {
        this.color = color;
    }

    public static void main(String [] args) {
        Apple apple = new Apple("GREEN");
        System.out.println(apple.color);


        final int i1 = 1;
        final Integer i2 = 1;
        final String s1 = ":ONE";

        String str1 = i1 + s1;
        String str2 = i2 + s1;

        System.out.println(str1 == "1:ONE");
        System.out.println(str2 == "1:ONE");

        List<Boolean> list = new ArrayList<>();
        list.add(true);
        list.add(new Boolean("tRue"));
        list.add(new Boolean("abc"));

        Boolean remove = list.remove(1);
        System.out.println(remove);
        if(true) {
            System.out.println("from true...");
            list.remove(0);
        }

        System.out.println("lst"+list);

        List<String> trafficLight = new ArrayList<>();
        trafficLight.add(0, "RED");
        trafficLight.add(1, "RED");
        trafficLight.add(2, "ORANGE");
        trafficLight.add(3, "GREEN");

        trafficLight.remove(new Integer(2));

        System.out.println("TL"+trafficLight);


        LocalDate date = LocalDate.parse("2018-06-06");
        LocalDate localDate = date.minusDays(10);
        System.out.println("localDate"+localDate);


        //static Double d1;
        //static int x = d1.intValue();

        byte b1 = (byte) (127 + 21);
        System.out.println(b1);

        System.out.println(1 + 2 + 3 + 4 + "Hello");

        System.out.println("Hello"+1+2+3+4);

    }
}