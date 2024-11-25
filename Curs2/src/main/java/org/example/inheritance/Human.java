package org.example.inheritance;

public interface Human {
    public String BLOOD_COLOUR = "RED";

    public void walk ();
     default void speak () {
        System.out.println("Hey I am from Human");
    }
}
