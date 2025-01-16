package com;

abstract class Food {
    protected abstract double getCalories();
}
 
 class JunkFood extends Food {
   public double getCalories() {
        return 200.0;
    }
}