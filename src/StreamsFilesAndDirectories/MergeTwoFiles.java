package StreamsFilesAndDirectories;

import java.io.*;

public class MergeTwoFiles {
    public static void main(String[] args) {
        try (BufferedReader textOne = new BufferedReader(new FileReader("04. Java-Advanced-Files-and-Streams-Exercises-Resources/inputOne.txt"));
        BufferedReader textTwo = new BufferedReader(new FileReader("04. Java-Advanced-Files-and-Streams-Exercises-Resources/inputTwo.txt"));
             PrintWriter pw = new PrintWriter(new FileWriter("04. Java-Advanced-Files-and-Streams-Exercises-Resources/output.txt"))){
            String textToWrite = textOne.readLine();
            while (textToWrite != null) {
                pw.println(textToWrite);
                textToWrite = textOne.readLine();
            }
            textToWrite = textTwo.readLine();
            while (textToWrite != null) {
                pw.println(textToWrite);
                textToWrite = textTwo.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
