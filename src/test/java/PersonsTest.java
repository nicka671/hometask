import org.example.Person;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.example.Person.personTest;

public class PersonsTest {

    @Test
    public void test1() {
        Person person1 = new Person(13, LocalDate.of(2024, 2, 8));
        Person person2 = new Person(15, LocalDate.of(2023, 2, 8));
        Person person3 = new Person(15, LocalDate.of(2022, 2, 8));
        ArrayList<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personTest(personList);
    }
}