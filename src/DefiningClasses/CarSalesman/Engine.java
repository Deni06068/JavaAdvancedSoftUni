package DefiningClasses.CarSalesman;

public class Engine {
    String modelEngine;
    int power;
    String displacement;
    String efficiency;

    public String getModelEngine() {
        return modelEngine;
    }

    public int getPower() {
        return power;
    }

    public String getDisplacement() {
        return displacement;
    }

    public String getEfficiency() {
        return efficiency;
    }

    protected Engine(String[] input) {
        this.modelEngine = input[0];
        this.power = Integer.parseInt(input[1]);
        if (input.length == 3){
            if (Character.isDigit(input[2].charAt(0))){
                this.displacement = input[2];
                this.efficiency = "n/a";
            }else {
                this.displacement = "n/a";
                this.efficiency = input[2];
            }
        }else if (input.length == 2){
            this.displacement = "n/a";
            this.efficiency = "n/a";
        }else {
            this.displacement = input[2];
            this.efficiency = input[3];
        }
    }


}
