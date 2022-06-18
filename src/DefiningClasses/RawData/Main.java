package DefiningClasses.RawData;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());
        ArrayList<Car> cars = new ArrayList<>();

        for (int i = 0; i < lines; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            Car car = new Car(input);
            cars.add(car);
        }
        String command = scanner.nextLine();
        if (command.equals("fragile")) {
            for (Car car : cars) {
                if (car.getFragile()) {
                    System.out.println(car.model);
                }
            }
        }else if (command.equals("flamable")){
            for (Car car : cars) {
                if (car.getFlamable()) {
                    System.out.println(car.model);
                }
            }
        }
    }
}
