package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.List;

public class People {
    private List<Person> peopleList = new ArrayList<>();

    public Person add(long id, String name) {
        Person personToAdd = new Person(id, name);

        peopleList.add(personToAdd);

        return personToAdd;
    }

    public Person findById(long id) {
        for (Person person : peopleList) {
            if (person.getId() == id) {
                return person;
            }
        }
        return null;
    }

    public boolean contains(Person person) {
        for (Person person1 : peopleList) {
            if (person1.equals(person)) {
                return true;
            }
        }
        return false;
    }
    
}
