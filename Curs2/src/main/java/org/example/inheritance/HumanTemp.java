package org.example.inheritance;

public interface HumanTemp {
    default void speak () {
        System.out.println("Hey I am from HumanTemp");
    }
}
