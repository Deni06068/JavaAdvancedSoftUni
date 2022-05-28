package SetsAndMaps;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int firstSetSize = input[0];
        int secondSetSize = input[1];
        LinkedHashSet<String> firstSet = new LinkedHashSet<>();
        LinkedHashSet<String> secondSet = new LinkedHashSet<>();
        for (int i = 0; i < firstSetSize; i++) firstSet.add(scanner.nextLine());
        for (int i = 0; i < secondSetSize; i++) secondSet.add(scanner.nextLine());

        firstSet.retainAll(secondSet);
        for (String el : firstSet) System.out.print(el + " ");
    }
}
