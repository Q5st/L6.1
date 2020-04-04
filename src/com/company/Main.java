package com.company;

public class Main {

    public static void main(String[] args) {
        Dog d1 = new Dog();
        Dog d2 = new Dog();
        Cat c1 = new Cat();
        Dog d3 = new Dog();
        Dog d4 = new Dog();
        Cat c2 = new Cat();
        Cat c3 = new Cat();
        Cat c4 = new Cat();
        Animal[] an = new Animal[8];
        an[0]=d1;
        an[1]=d2;
        an[2]=c1;
        an[3]=d3;
        an[4]=d4;
        an[5]=c2;
        an[6]=c3;
        an[7]=c4;
        for (Animal e: an){
            System.out.println(e.feed() + " " + e.voice());
        }
    }
}

