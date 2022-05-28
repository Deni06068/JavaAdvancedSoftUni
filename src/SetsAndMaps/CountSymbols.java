package SetsAndMaps;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] characters = scanner.nextLine().toCharArray();

        TreeMap<Character, Integer> map = new TreeMap<>();
        for (char character : characters) {
            map.putIfAbsent(character, 0);
            map.replace(character, map.get(character) + 1);
        }
        map.forEach((k, v ) -> System.out.println(k + ": " + v + " time/s"));
    }
}
