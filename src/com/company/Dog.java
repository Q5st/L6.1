package com.company;

public class Dog implements Animal{

    @Override
    public String voice() {
        return "Gav";
    }

    @Override
    public String feed() {
        return "Meat";
    }
}
