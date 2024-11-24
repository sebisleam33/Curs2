package org.example.inheritance;

public class Musician extends Human {

    Keyboard myKeyboard = new Keyboard ();

    public void playKeyboard () {
        System.out.println(name + " is playing keyboard now.");
    }

    public void speak () {
        System.out.println(name + " will speak calm.");
    }

    public static void main(String[] args) {
        Musician a = new Musician();
        a.age = 22;
        a.name = "Jax";
        a.gender = "Male";
        a.playKeyboard();
        a.walk();
        a.myKeyboard.playSound();
    }
}
