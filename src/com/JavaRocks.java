package com;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class JavaRocks {

    public static void main(String[] args) {
       /* String str = "Java Rocks!";
        System.out.println(str.length() + " : " + str.charAt(10));

        List<String> trafficLight = new ArrayList<>();
        trafficLight.add(1, "RED");
        trafficLight.add(2, "ORANGE");
        trafficLight.add(3, "GREEN");

        trafficLight.remove(2);

        System.out.println(trafficLight);*/

        LocalDate joiningDate = LocalDate.parse("2006-03-16");
        System.out.println(joiningDate.withDayOfYear(29));

        System.out.println("Hello" + 1 + 2 + 3 + 4);

        int x = 2;
        switch (x) {
            default:
                System.out.println("Still no idea what x is");
            case 1:
                System.out.println("x is equal to 1");
                break;
            case 2:
                System.out.println("x is equal to 2");
                break;
            case 3:
                System.out.println("x is equal to 3");
                break;
        }

        /*Boolean b = new Boolean(true);
        switch(b) {
            case true:
                System.out.println("ONE");
            case false:
                System.out.println("TWO");
            default:
                System.out.println("THREE");
        }*/

        List<Integer> list = new ArrayList<>();
        list.add(111);
        list.add(new Integer(110));
        list.add(110);

        list.removeIf(i -> i == 110);
        System.out.println(list);
    }
}
