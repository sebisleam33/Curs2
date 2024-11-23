package org.example.FlowControlPckg;

public class FlowControlSample {
    public static void main(String[] args) {
        int guess = 5;
        switch (guess) {
            case 1 : {
                System.out.println("Guess is 1.");
                break;
            }
            case 2 : {
                System.out.println("Guess is 2.");
                break;
            }
            case 3 : {
                System.out.println("Guess is 3.");
                break;
            }
            default : {
                System.out.println("Guess is greater than 3 or less than 1.");
                break;
            }
        }
//        if (guess == 1 ) {
//            System.out.println("Guess is 1");
//        } else if (guess == 2 ) {
//            System.out.println("Guess is 2");
//        } else if (guess == 3 ) {
//            System.out.println("Guess is 3 ");
//        } else {
//            System.out.println("Guess is greater than 3 or less than 1.");
//        }
    }
}
