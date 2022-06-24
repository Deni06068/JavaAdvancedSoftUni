package ExamPreparation.Cooking;

import java.util.*;

public class FoodFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Character> vowels = new ArrayDeque<Character>();
        ArrayDeque<Character> consonants = new ArrayDeque<Character>();
        String[] words = new String[]{"pear", "flour", "pork", "olive"};
        String[] wordsToPrint = new String[]{"", "", "", ""};
        ArrayList<String> wordsFound = new ArrayList<>();
        Arrays.stream(scanner.nextLine().split(" ")).forEach(c -> vowels.offer((c.charAt(0))));
        Arrays.stream(scanner.nextLine().split(" ")).forEach(c -> consonants.push(c.charAt(0)));

        while (!consonants.isEmpty()) {
            char vowel = vowels.poll();
            char consonant = consonants.pop();
            for (int i = 0; i < words.length; i++) {
                if (words[i].indexOf(vowel) >= 0) {
                    wordsToPrint[i] = wordsToPrint[i] + vowel;
                }
                if (words[i].indexOf(consonant) >= 0) {
                    wordsToPrint[i] = wordsToPrint[i] + consonant;
                }
            }
            vowels.offer(vowel);
        }
        for (int i = 0; i < words.length; i++) {
            boolean isFound = true;
            String word = words[i];
            for (int j = 0; j < word.length(); j++) {
                char oneChar = word.charAt(j);
                if (wordsToPrint[i].indexOf(oneChar) < 0) {
                    isFound = false;
                }

            }
            if (isFound){
                wordsFound.add(words[i]);
            }
        }
        System.out.println("Words found: " + wordsFound.size());
        for (String s : wordsFound) {
            System.out.println(s);
        }
    }
}
