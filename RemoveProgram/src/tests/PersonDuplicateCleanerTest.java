package tests;

import model.Person;
import org.junit.jupiter.api.Test;
import worker.PersonDuplicateCleaner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PersonDuplicateCleanerTest {

    @Test
    void removeDuplicateTest() {
//        when
        Person person = new Person("Artur", "Pabjan", 21);
        Person person2 = new Person("Artur", "Pabjan", 21);
        Person person3 = new Person("John", "Smith", 21);
        List<Person> people = new ArrayList<>();
        people.add(person);
        people.add(person2);
        people.add(person3);

//        given
        PersonDuplicateCleaner cleaner = new PersonDuplicateCleaner(people);
        cleaner.removeDuplicates();
        System.out.println(people);
        System.out.println(cleaner.getPeople());

//        then
        assertNotEquals(people, cleaner.getPeople());
    }

}