package org.example.polymorphism;

public class WildAnimal extends Animal{

    @Override
    public void eat() {
        System.out.println("I will eat meat.");
    }

    @Override
    public void run() {
        System.out.println("I'm running at: " + getMinSpeed());
    }
}
