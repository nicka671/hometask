package org.example;


import java.time.LocalDate;
import java.util.HashMap;
import java.util.TreeMap;

public class TreeMapManipulations {

    public static void main(String[] args) {
        Event event = new Event(LocalDate.of(2021, 2, 8), "old");
        Event event1 = new Event(LocalDate.of(2022, 2, 8), "new");
        Event event2 = new Event(LocalDate.of(2024, 2, 8), "very new");
        HashMap<LocalDate, String> storeDatesUnsorted = new HashMap<>();
        storeDatesUnsorted.put(event.getEventDate(), event.getMessage());
        storeDatesUnsorted.put(event1.getEventDate(), event1.getMessage());
        storeDatesUnsorted.put(event2.getEventDate(), event2.getMessage());
        TreeMap<LocalDate, String> storeDates = new TreeMap<>(storeDatesUnsorted);
        for (LocalDate lcd : storeDates.keySet()) {
            System.out.println(lcd + " " + storeDates.get(lcd));
        }
    }
}


class Event {

    LocalDate eventDate;
    String message;

    public LocalDate getEventDate() {
        return eventDate;
    }

    public void setEventDate(LocalDate eventDate) {
        this.eventDate = eventDate;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    public Event(LocalDate eventDate, String message) {
        this.eventDate = eventDate;
        this.message = message;
    }

}
