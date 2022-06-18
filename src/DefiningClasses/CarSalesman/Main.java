package DefiningClasses.CarSalesman;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Engine> engines = new HashMap<>();
        List<Car> cars = new ArrayList<>();


        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            Engine engine = new Engine(input);
            engines.put(input[0], engine);
        }
        int m = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < m; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            Car car = new Car(input, engines.get(input[1]));
            cars.add(car);
        }
        cars.stream().forEach(c -> System.out.println(c.toString()));
    }
}
