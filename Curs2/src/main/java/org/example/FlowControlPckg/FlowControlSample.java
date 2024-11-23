package org.example.FlowControlPckg;

public class FlowControlSample {
    public static void main(String[] args) {
        int guess = 5;
        if (guess == 1 ) {
            System.out.println("Guess is 1");
        } else if (guess == 2 ) {
            System.out.println("Guess is 2");
        } else if (guess == 3 ) {
            System.out.println("Guess is 3 ");
        } else {
            System.out.println("Guess is greater than 3 or less than 1.");
        }
    }
}
