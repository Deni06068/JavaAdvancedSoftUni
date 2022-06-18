package DefiningClasses.RawData;

public class Tire {
    double tirePressure;
    int tireAge;
    public Tire(double tirePressure, int tireAge) {
        this.tirePressure = tirePressure;
        this.tireAge = tireAge;
    }
    public boolean isLessThan1() {
        return tirePressure < 1.0;
    }
}
