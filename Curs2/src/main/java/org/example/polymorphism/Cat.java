package org.example.polymorphism;

public class Cat extends DomesticAnimal{

    @Override
    public void eat() {
        super.eat();
        System.out.println("I will eat meat as well.");
    }

    public static void main(String[] args) {
        Cat c = new Cat();
        c.setMinSpeed("34 KM/H");
        c.eat();
        c.run();
    }
}
