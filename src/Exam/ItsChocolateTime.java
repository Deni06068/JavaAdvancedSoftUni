package Exam;

import java.util.*;

public class ItsChocolateTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] milkString = scanner.nextLine().split("\\s+");
        String[] cacaoString = scanner.nextLine().split("\\s+");

        ArrayDeque<Double> milk = new ArrayDeque<>();
        Arrays.stream(milkString).forEach(m -> milk.offer(Double.parseDouble(m)));
        ArrayDeque<Double> cacao = new ArrayDeque<>();
        Arrays.stream(cacaoString).forEach(c -> cacao.push(Double.parseDouble(c)));
        int milkChocolate = 0;
        int darkChocolate = 0;
        int bakingChocolate = 0;


        while (!milk.isEmpty() && !cacao.isEmpty()){
            double result = cacao.peek() / (cacao.peek() + milk.peek());
            if (result == 1){
                bakingChocolate++;
                cacao.pop();
                milk.poll();
            }else if (result == 0.5){
                darkChocolate++;
                cacao.pop();
                milk.poll();
            }else if (result == 0.3){
                milkChocolate++;
                cacao.pop();
                milk.poll();
            }else {
                cacao.pop();
                milk.offer(milk.poll()+ 10);
            }


        }
        if (milkChocolate > 0 && darkChocolate > 0 && bakingChocolate > 0){
            System.out.println("It’s a Chocolate Time. All chocolate types are prepared.");
        }else {
            System.out.println("Sorry, but you didn't succeed to prepare all types of chocolates.");
        }
        if (bakingChocolate > 0) {
            System.out.println("# Baking Chocolate --> " + bakingChocolate);
        }
        if (darkChocolate > 0) {
            System.out.println("# Dark Chocolate --> " + darkChocolate);
        }
        if (milkChocolate > 0) {
            System.out.println("# Milk Chocolate --> " + milkChocolate);
        }


    }
}
