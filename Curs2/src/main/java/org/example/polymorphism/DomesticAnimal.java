package org.example.polymorphism;

public class DomesticAnimal extends Animal{

    @Override
    public void eat() {
        System.out.println("I will eat milk.");
    }

    @Override
    public void run() {
        System.out.println("I'm running at: " + getMinSpeed());
    }
}
