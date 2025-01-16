package com;

public class Test43 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("TOMATO");
        StringBuilder str = sb.reverse();
        StringBuilder s =  str.replace(0, sb.length(),sb.toString()); //Line n1
        System.out.println(s);
    }
}
