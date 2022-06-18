package DefiningClasses.RawData;

public class Engine {
    int engineSpeed;
    int enginePower;

    public Engine(int engineSpeed, int enginePower) {
        this.engineSpeed = engineSpeed;
        this.enginePower = enginePower;
    }
    public boolean isMoreThan250HP(){
        return enginePower > 250;
    }
}
