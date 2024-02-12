package org.example;

import java.time.LocalDate;
import java.util.LinkedList;

public class SimpleQueue<T> {
    private LinkedList<T> queue = new LinkedList<>();

    public void enqueue(T element) {
        queue.addLast(element);
    }

    public T dequeue() {
        T t = queue.getLast();
        queue.removeFirst();
        return t;
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int size() {
        return queue.size();
    }

    public static void main(String[] args) {
        SimpleQueue<String> stringQueue = new SimpleQueue<>();

// Enqueue some elements
        stringQueue.enqueue("Element 1");
        stringQueue.enqueue("Element 2");
        stringQueue.enqueue("Element 3");

// Print the size of the queue
        System.out.println("Queue size: " + stringQueue.size());

// Dequeue and print elements
        while (!stringQueue.isEmpty()) {
            System.out.println("Dequeued: " + stringQueue.dequeue());
        }

// Check if the queue is empty
        System.out.println("Is the queue empty? " + stringQueue.isEmpty());
    }

}
