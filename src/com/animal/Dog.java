package com.animal;

public class Dog extends Animal implements Moveable {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.move();
    }
}