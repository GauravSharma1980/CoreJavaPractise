package com;

import java.util.ArrayList;
import java.util.List;

public class Test40 {

        public static void main(String[] args) {
            List<Integer> list = new ArrayList<>();
            byte b = 10;
            //list.add(b); //Line n1
            int mul = list.get(0) * list.get(0); //Line n2
            //System.out.println(mul);

            args[1] = "Day!";
            System.out.println(args[0] + " " + args[1]);
        }
}
