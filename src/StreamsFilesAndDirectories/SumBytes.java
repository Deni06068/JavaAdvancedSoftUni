package StreamsFilesAndDirectories;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SumBytes {
    public static void main(String[] args) {
        try (BufferedReader bf = new BufferedReader(new FileReader("04. Java-Advanced-Files-and-Streams-Exercises-Resources/input.txt"))){
            String line = bf.readLine();
            long sum = 0;
            while (line != null){
                char[] charactersFromLine = line.toCharArray();
                for(char character:charactersFromLine){
                    sum += character;
                }
                line = bf.readLine();
            }
            System.out.println(sum);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
