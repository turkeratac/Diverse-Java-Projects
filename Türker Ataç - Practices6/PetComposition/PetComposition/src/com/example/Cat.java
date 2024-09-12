package com.example;

public class Cat extends Animal implements Pet {
    private Ambulatory ambulatory;

    private Nameable nameable = new NameableImpl();
    @Override
    public void setName(String name) {
        nameable.setName(name);
    }

    @Override
    public String getName() {
        return nameable.getName();
    }

    @Override
    public void walk() {
        ambulatory.walk();
    }

    public Cat() {
        this("Fluffy");
        ambulatory = new AmbulatoryImpl(4);
    }
    
    public Cat(String name) {
        super(4);
        setName(name);
    }

    @Override
    public void eat() {
        System.out.println("Cats like to eat spiders and fish.");
    }


    @Override
    public void play() {
        System.out.println("Cats like to play with string.");
    }
    
}