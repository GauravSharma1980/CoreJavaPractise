package com;


interface Profitable {
    double profitPercentage = 42.0;
}

class Business implements Profitable {
    double profitPercentage = 50.0; //Line n1
}

public class Test41 {
    public static void main(String[] args) {
        Profitable obj = new Business(); //Line n2
        System.out.println(obj.profitPercentage); //Line n3
    }
}

