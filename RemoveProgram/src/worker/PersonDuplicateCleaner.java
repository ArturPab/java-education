package worker;

import model.Person;

import java.util.List;
import java.util.stream.Collectors;

public class PersonDuplicateCleaner {
    private List<Person> people;

    public PersonDuplicateCleaner(List<Person> people) {
        this.people = people;
    }

    public List<Person> getPeople() {
        return people;
    }

    public void setPeople(List<Person> people) {
        this.people = people;
    }

    public void removeDuplicates() {
        List<Person> cleanedList = this.people.stream().distinct().collect(Collectors.toList());
        setPeople(cleanedList);
    }
}
