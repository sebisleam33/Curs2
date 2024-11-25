package org.example.inheritance;

public class Musician extends Human {

    public void walk () {
        System.out.println("This is from Musician.");
    }

    public static void main(String[] args) {
        Musician a = new Musician();
        a.speak();
        a.walk();
    }
}
