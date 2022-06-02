package FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class KnightsOfHonor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Consumer<String> c = names -> Arrays.stream(names.split("\\s+")).forEach(name -> System.out.println("Sir " + name));
        c.accept(scanner.nextLine());
    }
}
