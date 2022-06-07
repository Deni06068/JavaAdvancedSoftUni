package DefiningClasses.OpinionPoll;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lines = Integer.parseInt(scanner.nextLine());
        Set<Person> people = new TreeSet<>(Comparator.comparing(person -> person.name));

        for (int i = 0; i < lines; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String name = input[0];
            int age = Integer.parseInt(input[1]);
            Person person = new Person(name, age);
            people.add(person);
        }
        people.stream().filter(p -> p.age > 30).forEach(p -> System.out.println(p.name + " - " + p.age));
    }
}
