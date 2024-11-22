package org.example;

public class Main {
    public static void main(String[] args) {
        Main obj = new Main();
        obj.sayHello("Male");
    }

    public void sayHello(String gender) {
        String newText = gender.equals("Male") ? "Hello, Sir" : "Hello Madam";
        System.out.println(newText);
    }
}