package org.example;

//1. Sorting using Comparator and Comparable:
//        Implement one generic method to sort persons by age and registrationDate
//
//        Given:
//static class Person implements Comparable<Person> {
//    int age;
//    LocalDate registrationDate;
//
//    public Person(int age, LocalDate registrationDate) {
//        this.age = age;
//        this.registrationDate = registrationDate;
//    }
//
//... //getters and setter
//}

import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person implements Comparable<Person> {

    int age;
    LocalDate registrationDate;

    public Person(int age, LocalDate registrationDate) {
        this.age = age;
        this.registrationDate = registrationDate;
    }

    @Override
    public int compareTo(Person o) {
        if (this.age != o.age) {
            return this.age - o.age;
        } else {
            return this.registrationDate.compareTo(o.registrationDate);
        }
    }

    public static void personTest(ArrayList<Person> personList) {

        System.out.println("Before sorting:");
        for(Person person :personList)
        {
            System.out.println("Age: " + person.age + ", Registration Date: " + person.registrationDate);
        }

        Collections.sort(personList);

        System.out.println("After sorting:");
        for(Person person :personList)
        {
            System.out.println("Age: " + person.age + ", Registration Date: " + person.registrationDate);
        }

    }


}



