package com;


class Super53 {
    final int NUM = -1; //Line n1
}

class Sub53 extends Super53 {
    int NUM = -1;
}

public class Test53 {
    public static void main(String[] args) {
        Sub53 obj = new Sub53();
        obj.NUM = 200; //Line n2
        System.out.println(obj.NUM); //Line n3
    }
}

