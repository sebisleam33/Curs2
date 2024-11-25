package org.example.inheritance;

public interface Human {
    public String BLOOD_COLOUR = "RED";

    public void walk () {
        System.out.println(name + " walks like this");
    }
    public void speak () {
        System.out.println(name + " will speak like this");
    }
}
