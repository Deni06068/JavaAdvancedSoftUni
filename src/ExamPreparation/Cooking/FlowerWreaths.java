package ExamPreparation.Cooking;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FlowerWreaths {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] liliesInput = scanner.nextLine().split(", ");
        String[] rosesInput = scanner.nextLine().split(", ");
        ArrayDeque<Integer> lilies = new ArrayDeque<>();
        ArrayDeque<Integer> roses = new ArrayDeque<>();
        for (String flower : liliesInput) {
            lilies.push(Integer.parseInt(flower));
        }
        for (String flower : rosesInput) {
            roses.offer(Integer.parseInt(flower));
        }

        int wreathsCount = 0;
        int flowersLeft = 0;

        while (!lilies.isEmpty() && !roses.isEmpty()) {
            int sum = lilies.pop() + roses.poll();
            while (sum > 15) {
                sum -= 2;
            }
            if (sum == 15) {
                wreathsCount++;
            } else {
                flowersLeft += sum;
            }
        }
        wreathsCount = wreathsCount + (flowersLeft / 15);
        if (wreathsCount >= 5){
            System.out.println("You made it, you are going to the competition with " + wreathsCount + " wreaths!");
        }else {
            System.out.println("You didn't make it, you need " + (5 - wreathsCount) + " wreaths more!");
        }
    }
}
