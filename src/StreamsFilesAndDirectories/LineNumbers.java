package StreamsFilesAndDirectories;

import java.io.*;

public class LineNumbers {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("04. Java-Advanced-Files-and-Streams-Exercises-Resources/inputLineNumbers.txt"));
             PrintWriter pw = new PrintWriter(new FileWriter("04. Java-Advanced-Files-and-Streams-Exercises-Resources/output.txt"))){
            String line = br.readLine();
            int lineNumber = 1;
            while (line != null){
                pw.printf("%d. %s%n", lineNumber, line);
                lineNumber++;
                line = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
