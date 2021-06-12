package by.yurachel.rest.dao;

import by.yurachel.rest.models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDao {
    private static int PEOPLE_COUNT;
    private List<Person> people;

    {
        people = new ArrayList<>();
        people.add(new Person(++PEOPLE_COUNT, "Yura"));
        people.add(new Person(++PEOPLE_COUNT, "Marsy"));
        people.add(new Person(++PEOPLE_COUNT, "Vika"));
    }


    public List<Person> index() {
        return people;
    }

    public Person show(int id) {
        return people.stream().filter(people -> people.getId() == id)
                .findAny()
                .orElse(null);
    }

    public List<Person> getPeople() {
        return people;
    }

    public void setPeople(List<Person> people) {
        this.people = people;
    }


    public void save(Person person) {
        person.setId(++PEOPLE_COUNT);
        people.add(person);
    }

    public void update(int id, Person person) {
        Person personToBeUpdated = show(id);
        personToBeUpdated.setName(person.getName());
    }
}
