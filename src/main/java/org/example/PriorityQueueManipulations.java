package org.example;
//
//Create a PriorityQueue of integers and add elements with different priorities.
//        Retrieve and print elements in priority order.
//
//        Given:
//class Events {
//    LocalDate EventsDate;
//    String message;
//
////constructor and getters, setterd
//...
//}
//
//...
//        List<Events> Eventss = List.of(new Events(...), new Events(...), ...);
//
////implement method that stores Eventss in queue and retrieve elements in priority order by EventsDate (Eventss with an earlier registration date should be retrieved first)

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueManipulations {


    public static void main(String[] args) {
        List<Events> eventsList = List.of(new Events(LocalDate.of(2025, 2, 8), "future"), new Events(LocalDate.of(2020, 2, 8), "old"), new Events(LocalDate.of(2023, 2, 8), "new"));
        PriorityQueue<Events> priorityQueue = new PriorityQueue<>(new EventsComparator());
        System.out.println(priorityQueue);
        for (Events event : eventsList) {
            priorityQueue.offer(event);
        }
        while (!priorityQueue.isEmpty()) {
            Events event = priorityQueue.poll();
            System.out.println("Date: " + event.getEventsDate() + ", Event: " + event.getMessage());
        }
    }


}

class Events {

    LocalDate EventsDate;
    String message;

    public LocalDate getEventsDate() {
        return EventsDate;
    }

    public void setEventsDate(LocalDate EventsDate) {
        this.EventsDate = EventsDate;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    public Events(LocalDate EventsDate, String message) {
        this.EventsDate = EventsDate;
        this.message = message;
    }


    @Override
    public String toString() {
        return "Events{" +
                "EventsDate=" + EventsDate +
                ", message='" + message + '\'' +
                '}';
    }

}

class EventsComparator implements Comparator<Events> {

    @Override
    public int compare(Events e1, Events e2) {
        return e1.getEventsDate().compareTo(e2.getEventsDate());
    }
}

