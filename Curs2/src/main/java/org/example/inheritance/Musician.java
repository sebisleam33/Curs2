package org.example.inheritance;

public class Musician implements Human {

    Keyboard myKeyboard = new Keyboard ();

    public void playKeyboard () {
        System.out.println("Musicians are playing keyboard now.");
    }

    public void speak () {
        System.out.println("Musicians will speak calm.");
    }
    public void walk () {
        System.out.println("This is how musicians will walk.");
    }

    public static void main(String[] args) {
        Musician a = new Musician();
        
        a.playKeyboard();
        a.walk();
        a.myKeyboard.playSound();
    }
}
