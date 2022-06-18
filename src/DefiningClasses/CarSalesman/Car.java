package DefiningClasses.CarSalesman;

import java.util.Map;

public class Car {
    String model;
    Engine engine;
    String wight;
    String colour;

    protected Car(String[] input, Engine engine) {
        this.model = input[0];
        this.engine = engine;
        if (input.length == 2){
            this.wight = "n/a";
            this.colour = "n/a";
        }else if (input.length == 3){
            if (Character.isDigit(input[2].charAt(0))){
                this.wight = input[2];
                this.colour = "n/a";
            }else {
                this.wight = "n/a";
                this.colour = input[2];
            }
        }else {
            this.wight = input[2];
            this.colour = input[3];
        }
    }

    @Override
    public String toString() {
        return String.format("%s:%n%s:%nPower: %d%nDisplacement: %s%nEfficiency: %s%nWeight: %s%nColor: %s"
                , this.model, engine.getModelEngine(), engine.getPower(), engine.getDisplacement(), engine.getEfficiency(), this.wight, this.colour);
    }
}
