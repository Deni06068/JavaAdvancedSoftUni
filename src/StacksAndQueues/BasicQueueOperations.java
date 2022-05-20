package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] commands = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int numsToOffer = commands[0];
        int numsToRemove = commands[1];
        int numToCheck = commands[2];
        int[] nums = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < numsToOffer; i++) {
            queue.offer(nums[i]);
        }
        for (int i = 0; i < numsToRemove; i++) {
            queue.poll();
        }
        if (!queue.isEmpty()) {
            if (queue.contains(numToCheck)) {
                System.out.println("true");
            } else {
                System.out.println(Collections.min(queue));
            }
        }else System.out.println(0);


    }
}