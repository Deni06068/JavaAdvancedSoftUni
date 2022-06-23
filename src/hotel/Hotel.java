package hotel;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Hotel {
    public ArrayList<Person> roster;
    public String name;
    public int capacity;

    public Hotel(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.roster = new ArrayList<>();
    }

    public void add(Person person) {
        if (roster.size() < capacity) {
            roster.add(person);
        }
    }

    public boolean remove(String name) {
        boolean isRemoved = false;
        for (Person person : roster) {
            if (person.getName().equals(name)) {
                roster.remove(person);
                isRemoved = true;
                break;
            }
        }
        return isRemoved;
    }

    public Person getPerson(String name, String hometown) {
        for (Person person : roster) {
            if (person.getName().equals(name) && person.getHometown().equals(hometown)) {
                return person;
            }
        }
        return null;
    }

    public int getCount() {
        return roster.size();
    }

    public String getStatistics() {
        return "The people in the hotel " + this.name + " are:" + System.lineSeparator() + roster.stream().map(person -> person.toString()).collect(Collectors.joining(System.lineSeparator()));
    }
}
