package SetsAndMaps;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> namesAndMails = new LinkedHashMap<>();
        String input = scanner.nextLine();
        while (!input.equals("stop")) {
            String name = input;
            String mail = scanner.nextLine();
            String[] mailArr = mail.split("\\.");
            if (mailArr[mailArr.length - 1].equals("us") || mailArr[mailArr.length - 1].equals("uk") || mailArr[mailArr.length - 1].equals("com")){
                input = scanner.nextLine();
                continue;
            }else {
                namesAndMails.put(name, mail);
            }

            input = scanner.nextLine();
        }
        namesAndMails.forEach((n, e) -> System.out.println(n + " -> " + e));
    }
}
