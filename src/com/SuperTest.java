package com;

class Super {
    void Super() {
        System.out.print("KEEP_");
    }
}

class BaseSuper extends Super {
    BaseSuper() {
        Super();
        System.out.print("GOING_");
    }
}

public class SuperTest {
    public static void main(String[] args) {
        new BaseSuper();
    }
}
