package com;

class Parent32 {
    int var = 1000; // Line n1

    int getVar() {
        return var;
    }
}

class Child32 extends Parent32 {
    private int var = 2000; // Line n2

    int getVar() {
        return super.var; //Line n3
    }
}

public class Test32 {
    public static void main(String[] args) {
        Child32 obj = new Child32(); // Line n4
        //System.out.println(obj.var); // Line n5
        System.out.println(obj.getVar()); // Line n5
        Parent32 parent32 = new Parent32();
        System.out.println(parent32.getVar());
        parent32 = new Child32();
        System.out.println(parent32.getVar());
    }
}
