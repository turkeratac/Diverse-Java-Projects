package com.example;

public abstract class Animal implements Ambulatory   {
    
    protected int legs;
    
    public Animal(int legs) {
        this.legs = legs;
    }

    @Override
    public void walk() {
        // Animal sınıfının yürüme davranışı
    }
    
    public abstract void eat();
    
}