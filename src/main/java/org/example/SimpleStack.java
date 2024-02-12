package org.example;

import java.util.ArrayList;

public class SimpleStack<T> {
    private ArrayList<T> stack = new ArrayList<>();

    public void push(T element) {
        stack.add(element);
        System.out.println("Added element: " + element + " to the stack.");
    }

    public T pop() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty. Cannot pop an element.");
            return null;
        } else {

            T poppedElement = stack.remove(stack.size() - 1);
            System.out.println("Popped element: " + poppedElement + " from the stack.");
            return poppedElement;
        }
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int size() {
        return stack.size();
    }


    public static void main(String[] args) {
        SimpleStack<String> stringStack = new SimpleStack<>();

// Push some elements
        stringStack.push("Element 1");
        stringStack.push("Element 2");
        stringStack.push("Element 3");

// Print the size of the stack
        System.out.println("Stack size: " + stringStack.size());

// Pop and print elements
        while (!stringStack.isEmpty()) {
            System.out.println("Popped: " + stringStack.pop());
        }

// Check if the stack is empty
        System.out.println("Is the stack empty? " + stringStack.isEmpty());
    }
}