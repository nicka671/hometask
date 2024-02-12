package org.example;

import java.util.LinkedList;

public class LinkedListManipulations {

    // Create a LinkedList of characters
    public static void main(String[] args) {
        LinkedList<Character> charList = new LinkedList<>();
        charList.add('A');
        charList.add('B');
        charList.add('C');
        charList.add('D');

        System.out.println("Original LinkedList: "+ charList);

        System.out.println("Reversed LinkedList: " + charList.reversed());
    }
}
