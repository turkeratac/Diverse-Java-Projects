package com.example;

public class NameableImpl implements Nameable {
    private static final int MAX_NAME_LENGTH = 20;
    private String name;

    @Override
    public void setName(String name) {
        if (name.length() <= MAX_NAME_LENGTH) {
            this.name = name;
        } else {
            System.out.println("Name too long");
        }

    }
    @Override
    public String getName() {
        return name;
    }
}