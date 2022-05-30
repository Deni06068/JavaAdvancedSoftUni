package StreamsFilesAndDirectories;

import java.io.*;

public class AllCapitals {
    public static void main(String[] args) throws FileNotFoundException {
        try(BufferedReader br = new BufferedReader(new FileReader("04. Java-Advanced-Files-and-Streams-Exercises-Resources/input.txt"));
            PrintWriter pr = new PrintWriter(new FileWriter("04. Java-Advanced-Files-and-Streams-Exercises-Resources/output.txt"))){
            br.lines().forEach(line -> pr.println(line.toUpperCase()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
