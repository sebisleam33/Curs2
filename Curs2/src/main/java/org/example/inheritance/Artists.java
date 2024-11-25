package org.example.inheritance;

public class Artists extends Human {

    public void walk () {
        System.out.println("This is from Artists.");
    }

    public static void main(String[] args) {
        Artists a = new Artists();
        a.speak();
        a.walk();
    }
}
