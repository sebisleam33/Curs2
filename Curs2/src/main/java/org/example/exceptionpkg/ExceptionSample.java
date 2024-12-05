package org.example.exceptionpkg;

public class ExceptionSample {
    public static void main(String[] args) {
        try {
            doSomething();
        } catch (NumberFormatException e) {
            System.out.println("Invalid numbers.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Give numbers between 1 to 4.");
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        } finally {
            System.out.println("It will always execute.");
        }
    }
    public static void doSomething () throws ArrayIndexOutOfBoundsException, NumberFormatException{
        int userInput = 0;
        userInput = Integer.parseInt("1");
        String fruits[] = {"Bananas", "Watermelons", "Apples", "Oranges"};
        System.out.println("User picked: " + fruits[userInput - 1]);
    }
}
