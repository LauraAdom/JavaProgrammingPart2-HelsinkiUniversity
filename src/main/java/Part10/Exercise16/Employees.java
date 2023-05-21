package Part10.Exercise16;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {

    private List<Person> persons;

    public Employees() {
        this.persons = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        persons.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        Iterator<Person> iterrator = peopleToAdd.iterator();

        while (iterrator.hasNext()) {
            persons.add(iterrator.next());
        }
    }

    public void print() {
        persons.stream()
                .forEach(person -> System.out.println(person.toString()));
    }

    public void print(Education education) {

        Iterator<Person> iterator = this.persons.iterator();

        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getEducation() == education) {
                System.out.println(person.toString());
            }
        }
    }

    public void fire(Education education) {

        Iterator<Person> iterator = this.persons.iterator();

        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getEducation() == education) {
                iterator.remove();
            }
        }
    }
}