package StacksAndQueues;

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = Integer.parseInt(scanner.nextLine());
    long result = 0;
    long memoryResult1 = 0;
    long memoryResult2 = 1;
    for (int i = 1; i < n; i++) {
        result = memoryResult1 + memoryResult2;
        memoryResult1 = memoryResult2;
        memoryResult2 = result;
    }
    System.out.println(result);
}
}
