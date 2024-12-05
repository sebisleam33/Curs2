package org.example.exceptionpkg;

public class ExceptionSample {
    public static void main(String[] args) {
        int userInput = 0;
        try {
            userInput = Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println("Invalid numbers.");
        }
        String fruits[] = {"Bananas", "Watermelons", "Apples", "Oranges"};
        System.out.println("User picked: " + fruits[userInput - 1]);
    }
}
