package com;

class Car {
/*    void speed(Byte val) { //Line n1
        System.out.println("DARK"); //Line n2
    } //Line n3*/

    void speed(byte... vals) {
        System.out.println("LIGHT");
    }
}

public class Test26 {
    public static void main(String[] args) {
        byte b = 10; //Line n4
        new Car().speed(b); //Line n5
    }
}
