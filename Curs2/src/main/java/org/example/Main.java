package org.example;

public class Main {
    byte x = 10;
    byte y = 20;
    byte z = (byte) (x + y);
    public static void main(String[] args) {
        Main obj = new Main();
        System.out.println(obj.z);
    }

    public void scopeTest () {
        String text = "Welcome";
        System.out.println(text);
    }
}