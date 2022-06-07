package SetsAndMaps;

import java.util.*;

public class HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Set<String>> players = new LinkedHashMap<>();

        String[] input = scanner.nextLine().split(": ");
        while (!input[0].equals("JOKER")) {
            String name = input[0];
            String[] cards = input[1].split(",\\s+");
            players.putIfAbsent(name, new HashSet<>());
            Set<String> set = new HashSet<>();
            players.get(name).addAll(List.of(cards));
            input = scanner.nextLine().split(":\\s+");
        }
        Map<String, Integer> playersAndScore = new LinkedHashMap<>();
        players.forEach((p, s) -> s.forEach(sPower ->
        {
            if (playersAndScore.containsKey(p)) {
                playersAndScore.put(p, playersAndScore.get(p) + cardPower(p, sPower));
            } else {
                playersAndScore.put(p, cardPower(p, sPower));
            }
        }));
        playersAndScore.forEach((p, s) -> System.out.println(p + ": " + s));
    }

    private static int cardPower(String name, String card) {
        int power = 0;
        char type = ' ';
        if (card.charAt(0) == (char) 'J') {
            power = 11;
            type = (char) card.charAt(1);
        } else if (card.charAt(0) == (char) 'Q') {
            power = 12;
            type = (char) card.charAt(1);
        } else if (card.charAt(0) == (char) 'K') {
            power = 13;
            type = (char) card.charAt(1);
        } else if (card.charAt(0) == (char) 'A') {
            power = 14;
            type = (char) card.charAt(1);
        } else if (card.length() == 2) {
            power = Integer.parseInt(String.valueOf(card.charAt(0)));
            type = (char) card.charAt(1);
        } else if (card.length() == 3) {
            power = 10;
            type = (char) card.charAt(2);

        }
        int typeInt = 0;
        switch (type) {
            case 'S':
                typeInt = 4;
                break;
            case 'H':
                typeInt = 3;
                break;
            case 'D':
                typeInt = 2;
                break;
            case 'C':
                typeInt = 1;
                break;
        }
        return power * typeInt;
    }
}
