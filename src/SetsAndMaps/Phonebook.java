package SetsAndMaps;

import java.util.HashMap;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        HashMap<String, String> phonebook = new HashMap<>();

        while (!input.equals("search")) {
            String[] nameAndNumber = input.split("-");
            phonebook.put(nameAndNumber[0], nameAndNumber[1]);
            input = scanner.nextLine();
        }
        input = scanner.nextLine();
        while (!input.equals("stop")){
            if (phonebook.containsKey(input)){
                System.out.println(input + " -> " + phonebook.get(input));
            }else {
                System.out.printf("Contact %s does not exist.%n", input);
            }
            input = scanner.nextLine();
        }
    }
}
