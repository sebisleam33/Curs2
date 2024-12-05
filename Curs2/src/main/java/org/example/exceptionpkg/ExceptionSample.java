package org.example.exceptionpkg;

public class ExceptionSample {
    public static void main(String[] args) {
        int userInput = 0;
        try {
            userInput = Integer.parseInt("8");
            String fruits[] = {"Bananas", "Watermelons", "Apples", "Oranges"};
            System.out.println("User picked: " + fruits[userInput - 1]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid numbers.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Give numbers between 1 to 4.");
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }
}
