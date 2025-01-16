package com.animal;


 interface Moveable {
    public void move();
}
public abstract class Animal {
    public void  move() {
        System.out.println("ANIMAL MOVING");
    }
}