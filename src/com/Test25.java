package com;

class Lock {
    public void open() {
        System.out.println("LOCK-OPEN");
    }
}

class Padlock extends Lock {
    public void open() {
        System.out.println("PADLOCK-OPEN");
    }
}

class DigitalPadlock extends Padlock {
    public void open() {
        super.open();
    }
}

public class Test25 {
    public static void main(String[] args) {
        Lock lock = new DigitalPadlock();
        lock.open();
    }
}