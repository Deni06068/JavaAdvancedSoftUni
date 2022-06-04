package StreamsFilesAndDirectories;

import java.io.*;

public class CountCharacterTypes {
    public static void main(String[] args) {
        int vowels = 0;
        int consonants = 0;
        int punctuation = 0;

        try (FileReader fr = new FileReader("04. Java-Advanced-Files-and-Streams-Exercises-Resources/input.txt");
        PrintWriter pw = new PrintWriter("04. Java-Advanced-Files-and-Streams-Exercises-Resources/output.txt")){
            int symbol = fr.read();
            while (symbol >= 0) {
                char symbolAsChar = (char) symbol;
                if (symbolAsChar == 'a' || symbolAsChar == 'e' || symbolAsChar == 'i' || symbolAsChar == 'o' || symbolAsChar == 'u') {
                    vowels++;
                } else if (symbolAsChar == '!' || symbolAsChar == ',' || symbolAsChar == '.' || symbolAsChar == '?') {
                    punctuation++;
                } else if (!Character.isWhitespace(symbolAsChar)){
                    consonants++;
                }
                symbol = fr.read();
            }
            pw.println("Vowels: " + vowels);
            pw.println("Consonants: " + consonants);
            pw.println("Punctuation: " + punctuation);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
