package com;

public class Test52 {

    interface Counter {
        int count = 10; //Line n1
    }

    public static void main(String[] args) {
        Counter [] arr = new Counter[2]; //Line n2
        for(Counter ctr : arr) {
            System.out.print(ctr.count); //Line n3
        }
    }
}
