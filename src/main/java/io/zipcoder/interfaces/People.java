package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.List;

public class People {
    private final List<Person> peopleList = new ArrayList<>();

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

    public boolean removeByName(Person person) {
        for (Person person1 : peopleList) {
            if (person1.equals(person)) {
                peopleList.remove(person);
                return true;
            }
        }
        return false;
    }

    public boolean removeById(Long id) {
        for (Person person1 : peopleList) {
            if (id.equals(person1.getId())) {
                peopleList.remove(person1);
                return true;
            }
        }
        return false;
    }

    public boolean removeAll() {
        for (Person person1 : peopleList) {
            for (int i = 0; i < peopleList.size(); i++) {
                peopleList.remove(person1);
            }
            return true;
        }
        return false;
    }

    

}
