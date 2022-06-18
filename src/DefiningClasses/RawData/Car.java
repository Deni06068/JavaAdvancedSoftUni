package DefiningClasses.RawData;

import java.util.HashMap;
import java.util.Map;

public class Car {
    String[] input;
    Tire[] tires;
    Boolean isFragile;
    Engine engine;
    Cargo cargo;
    Tire tire1;
    Tire tire2;
    Tire tire3;
    Tire tire4;

    public Boolean getFragile() {
        boolean isLessThan1 = true;
        for (Tire tire : tires) {
            if (!tire.isLessThan1()) {
                isLessThan1 = false;
            }
        }
        return cargo.getCargoType().equals("fragile") && isLessThan1;
    }
    public boolean getFlamable() {
        return engine.isMoreThan250HP() && cargo.isFlamable();
    }

    String model;

    public Car(String[] input) {
        this.input = input;
        this.model = input[0];
        int engineSpeed = Integer.parseInt(input[1]);
        int enginePower = Integer.parseInt(input[2]);
        int cargoWeight = Integer.parseInt(input[3]);
        String cargoType = input[4];
        double tire1Pressure = Double.parseDouble(input[5]);
        int tire1Age = Integer.parseInt(input[6]);
        double tire2Pressure = Double.parseDouble(input[7]);
        int tire2Age = Integer.parseInt(input[8]);
        double tire3Pressure = Double.parseDouble(input[9]);
        int tire3Age = Integer.parseInt(input[10]);
        double tire4Pressure = Double.parseDouble(input[11]);
        int tire4Age = Integer.parseInt(input[12]);
        this.engine = new Engine(engineSpeed, enginePower);
        this.cargo = new Cargo(cargoWeight, cargoType);
        this.tire1 = new Tire(tire1Pressure, tire1Age);
        this.tire2 = new Tire(tire2Pressure, tire2Age);
        this.tire3 = new Tire(tire3Pressure, tire3Age);
        this.tire4 = new Tire(tire4Pressure, tire4Age);
        this.tires = new Tire[]{tire1, tire2, tire3, tire4};
    }

    public Cargo getCargo() {
        return cargo;
    }

}
