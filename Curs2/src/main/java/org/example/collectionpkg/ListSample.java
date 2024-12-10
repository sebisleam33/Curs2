package org.example.collectionpkg;

import org.example.inheritance.Artists;

import java.util.ArrayList;

public class ListSample {
    public static void main(String[] args) {
        ArrayList myList = new ArrayList();
        myList.add("Apple");
        myList.add(new Artists());
        System.out.println(myList);
        System.out.println(myList.get(0));
    }
}
