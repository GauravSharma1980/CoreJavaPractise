package com;

public class Test44 {

    public static void main(String[] args) {
        boolean res1  = "Java12" == "Java12";
        System.out.println(res1);
        boolean flag1 = "Java" == "Java".replace('J', 'J'); //Line n1
        boolean flag2 = "Java" == "Java".replace("J", "J"); //Line n2
        System.out.println(flag1 && flag2);
    }
}
