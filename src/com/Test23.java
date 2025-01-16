package com;

import java.io.IOException;

class Parent23 {
    Parent23() throws IOException {
        System.out.print("HAKUNA");
    }
}
 
class Child23 extends Parent23 {
    Child23() throws Exception {
        System.out.println("MATATA");
    }
}
 
public class Test23 {
    public static void main(String[] args) throws Exception {
        new Child23();
    }
}