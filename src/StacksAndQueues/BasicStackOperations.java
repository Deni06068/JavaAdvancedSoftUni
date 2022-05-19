package StacksAndQueues;

import java.util.*;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] line = scanner.nextLine().split(" ");
        int countOfPush = Integer.parseInt(line[0]);
        int countOfPop = Integer.parseInt(line[1]);
        int numToCheck = Integer.parseInt(line[2]);

        String[] numsAsString = scanner.nextLine().split("\\s+");
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < countOfPush; i++) {
            stack.push(Integer.parseInt(numsAsString[i]));
        }
        for (int i = 0; i < countOfPop; i++) {
            stack.pop();
        }
        if (stack.contains(numToCheck)){
            System.out.println("true");
        }else if (stack.isEmpty()){
            System.out.println("0");
        }else {
            System.out.println(Collections.min(stack));
        }

    }
}
