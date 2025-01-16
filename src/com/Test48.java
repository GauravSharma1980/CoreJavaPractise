package com;


class M48 {
    public void printName() {
        System.out.println("M48");
    }
}



class N48 extends M48 {
    public void printName() {
        System.out.println("N48");
    }
}


//Test.java


public class Test48 {
    public static void main(String[] args) {
        M48 obj1 = new N48();
        N48 obj2 = (N48)obj1;
        obj2.printName();
    }
}
