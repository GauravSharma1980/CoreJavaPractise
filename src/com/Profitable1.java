package com;

public interface Profitable1 {
    default double profit() {
        return 12.5;
    }
}