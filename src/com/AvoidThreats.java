package com;

public class AvoidThreats {
    public static void evaluate(Threat t) { //Line n5
        //t = new Threat(); //Line n6
        t.name = "PHISHING"; //Line n7
    }
    
    public static void main(String[] args) {
        Threat obj = new Threat(); //Line n1
        obj.print(); //Line n2
        evaluate(obj); //Line n3
        obj.print(); //Line n4

        int x = 5____0;

        int y = 0____50;

        int z = 50____0;

        float f = 123.76_86f;

        double d = 1_2_3_4;



    }
}
 
class Threat {
    String name = "VIRUS";
    
    public void print() {
        System.out.println(name);
    }
}