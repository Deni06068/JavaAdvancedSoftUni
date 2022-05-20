package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] brackets = scanner.nextLine().toCharArray();
        char openingBracket;
        ArrayDeque<Character> stack = new ArrayDeque<>();
        boolean isBalanced = true;
        for (int i = 0; i < brackets.length; i++) {
            if (brackets[i] == '(' || brackets[i] == '{' || brackets[i] == '[') {
                stack.push(brackets[i]);
            } else if (!stack.isEmpty()) {
                if ((stack.peek() == '(' && brackets[i] == ')')
                        || (stack.peek() == '{' && brackets[i] == '}')
                        || (stack.peek() == '[' && brackets[i] == ']')) {
                    stack.pop();
                } else {
                    isBalanced = false;
                    break;
                }
            } else {
                isBalanced = false;
            }
        }
        if (isBalanced) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
