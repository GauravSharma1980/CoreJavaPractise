package com;

class X {
    void greet() {
        System.out.println("Good Morning!");
    }
}
 
class Y extends X {
    void greet() {
        System.out.println("Good Afternoon!");
    }
}
 
class Z extends Y {
    void greet() {
        System.out.println("Good Night!");
    }
}

class M21  {
    void greet() {
        System.out.println("Good Night!");
    }
}
public class Test {
    public static void main(String[] args) {
        X x = new Z();
        x.greet(); //Line n1
        ((Y)x).greet(); //Line n2
        ((Z)x).greet(); //Line n3
        //((M21)x).greet(); //Line n3

        System.out.println();

    }
}