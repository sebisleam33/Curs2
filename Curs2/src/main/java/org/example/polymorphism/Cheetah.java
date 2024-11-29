package org.example.polymorphism;

public class Cheetah extends WildAnimal {
    public static void main(String[] args) {
        Cheetah c = new Cheetah();
        c.setMinSpeed("80 - 130 KM/H");
        c.eat();
        c.run();
    }
}
