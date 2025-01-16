package com;

class Shape34 {
    int side = 0; //Line n1

    int getSide() { //Line n2
        return side;
    }
}

class Square34 extends Shape34 {
    private int side = 4; //Line n3

    protected int getSide() { //Line n4
        return side;
    }
}


public class Test34 {
    public static void main(String[] args) {
        Shape34 s = new Square34();
        System.out.println(s.side + ":" + s.getSide());
    }
}
