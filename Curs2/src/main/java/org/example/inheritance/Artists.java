package org.example.inheritance;

public class Artists implements Human {

    public void walk () {
        System.out.println("This is how the artist will walk.");
    }

    public void speak () {
        System.out.println("This is how the artist will speak.");
    }

    public void preparePaint () {
        System.out.println(" is preparing for painting.");
    }

    public static void main(String[] args) {
        Artists a = new Artists();

        a.preparePaint();
        a.speak();
    }
}
