package com;

public class Test30 {
    private static void div() {
        System.out.println(1/0);
    }

    public static void main(String[] args) {
        try {
            div();
        } finally {
            System.out.println("FINALLY");
        }
    }
}
