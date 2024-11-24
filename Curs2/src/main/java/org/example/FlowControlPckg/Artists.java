package org.example.FlowControlPckg;

import org.example.inheritance.Human;

public class Artists extends Human {
    public void preparePaint () {
        System.out.println(name + " is preparing for painting.");
    }

    public static void main(String[] args) {
        Artists a = new Artists();
        a.name = "Lucia";
        a.age = 23;
        a.gender = "Female";

        a.preparePaint();
        a.walk();
    }
}
