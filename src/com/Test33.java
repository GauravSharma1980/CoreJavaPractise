package com;

class M33 {
    public void main(String[] args) { //Line 1
        System.out.println("M33");
    }
}

class N33 extends M33 {
    public void main(String[] args) { //Line 2
        new M33().main(args); //Line3
    }
}

public class Test33 {
    public static void maiN33(String[] args) {
        //N33.main(args); //Line N334
    }
}
