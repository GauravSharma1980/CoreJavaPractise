package com;

class Base21 {
    static void print() { //Line n1
        System.out.println("BASE");
    }
}
 
class Derived21 extends Base21 {
    static void print() { //Line n2
        System.out.println("DERIVED");
    }
}
 
public class Test21 {
    public static void main(String[] args) {
        Base21 b = null;
        Derived21 d = (Derived21) b; //Line n3
        d.print(); //Line n4
    }
}