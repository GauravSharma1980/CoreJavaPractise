package com;

public abstract class Profit implements Profitable1, Profitable2 {
    @Override
    public double profit() {
        return Profitable1.super.profit();
    }

}