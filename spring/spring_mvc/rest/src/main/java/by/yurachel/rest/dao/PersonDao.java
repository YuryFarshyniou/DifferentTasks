package by.yurachel.rest.dao;

import by.yurachel.rest.models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


//@Component
public class PersonDao {

    private List<Person> people = new ArrayList<Person>() {
        {
            people.add(new Person(1, "Yura"));
            people.add(new Person(2, "Marsy"));
            people.add(new Person(3, "Michs"));

        }
    };


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


}
