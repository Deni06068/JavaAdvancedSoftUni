package hotel;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Hotel {
    public ArrayList<Person> people;
    public String name;
    public int capacity;

    public Hotel(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.people = new ArrayList<>();
    }

    public void add(Person person) {
        if (people.size() < capacity) {
            people.add(person);
        }
    }

    public boolean remove(String name) {
        boolean isRemoved = false;
        for (Person person : people) {
            if (person.getName().equals(name)) {
                people.remove(person);
                isRemoved = true;
                break;
            }
        }
        return isRemoved;
    }

    public Person getPerson(String name, String hometown) {
        for (Person person : people) {
            if (person.getName().equals(name) && person.getHometown().equals(hometown)) {
                return person;
            }
        }
        return null;
    }

    public int getCount() {
        return people.size();
    }

    public String getStatistics() {
        return "The people in the hotel " + this.name + " are:" + System.lineSeparator() + people.stream().map(person -> person.toString()).collect(Collectors.joining(System.lineSeparator()));
    }
}
