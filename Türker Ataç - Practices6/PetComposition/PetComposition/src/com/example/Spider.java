package com.example;

public class Spider extends Animal {
    private Ambulatory ambulatory;

    @Override
    public void walk() {
        ambulatory.walk();
    }

    public Spider() {
        super(8);
        ambulatory = new AmbulatoryImpl(8); // Spider 8 bacaklı olduğu için 8 bacaklı bir AmbulatoryImpl nesnesi oluşturuyoruz.
    }

    @Override
    public void eat() {
        System.out.println("The spider eats a fly.");
    }
    
}