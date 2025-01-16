package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class Bonus {
    public static final String PROPERTY_CODE_REGEX = "^[A-Za-z0-9]{5}$";

     public static void main(String[] args) {
         int $ = 80000;
         String msg = ($ >= 50000) ? "Good bonus" : "Average bonus";
         System.out.println(msg);
         boolean nycmq = Pattern.matches(PROPERTY_CODE_REGEX, "NKCMQ");
         System.out.println(nycmq);

         List<String> lst = new ArrayList<>();

         List<String> str = Arrays.asList("a,b,c,d,e,f");

         System.out.println("llll"+str.contains("c,d"));


     }
}