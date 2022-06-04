package StreamsFilesAndDirectories;

import java.io.*;
import java.util.*;

public class WordCount {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(new FileReader("04. Java-Advanced-Files-and-Streams-Exercises-Resources/words.txt"));
             Scanner textScanner = new Scanner(new FileReader("04. Java-Advanced-Files-and-Streams-Exercises-Resources/text.txt"));
             PrintWriter pw = new PrintWriter("04. Java-Advanced-Files-and-Streams-Exercises-Resources/output.txt")) {
            Map<String,Integer> wordsToCheck = new LinkedHashMap<>();
            Arrays.stream(scan.nextLine().split(" ")).forEach(w -> wordsToCheck.put(w, 0));
            String textScan = textScanner.next();
            while (textScanner.hasNext()){
                if (wordsToCheck.containsKey(textScan)){
                    wordsToCheck.replace(textScan, wordsToCheck.get(textScan) + 1);
                }
                textScan = textScanner.next();
            }
            wordsToCheck.forEach((key, value) -> pw.printf("%s - %d%n", key, value));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
