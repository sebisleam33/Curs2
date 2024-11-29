package org.example.polymorphism;

public class Cat extends DomesticAnimal{

    @Override
    public void eat() {
        super.eat();
        System.out.println("I will eat meat as well.");
    }

    public void run(boolean hasDanger) {
        if(hasDanger) {
            System.out.println("I'm running at: 48 KM/H");
        } else {
            super.run();
        }
    }

    public static void main(String[] args) {
        Cat c = new Cat();
        c.setMinSpeed("34 KM/H");
        c.eat();
        c.run();
        c.run(true);
    }
}
