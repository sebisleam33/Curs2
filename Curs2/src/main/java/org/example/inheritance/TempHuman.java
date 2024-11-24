package org.example.inheritance;

public class TempHuman {
    public static void main(String[] args) {
        Artists a = new Artists();
        Artists b = new Artists();
        if(a.equals(b)) {
            System.out.println("Both are equal");
        } else {
            System.out.println("Both are not equal");
        }
    }
}
