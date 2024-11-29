package org.example.polymorphism;

public class Elephant extends WildAnimal {

    @Override
    public void eat() {
        System.out.println("I will eat fruits.");
    }

    public static void main(String[] args) {
        Elephant e = new Elephant();
        e.setMinSpeed("30 KM/H");
        e.eat();
        e.run();
    }
}
