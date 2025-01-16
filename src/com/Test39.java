package com;
interface Super39 {
    String name = "SUPER"; //Line n1
}

interface Sub39 extends Super39 { //Line n2
 
}

public class Test39 {
    public static void main(String[] args) {
        Sub39 sub = null;
        System.out.println(sub.name); //Line n3
    }
}