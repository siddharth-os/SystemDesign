import Strategy.Drive;

public class Vehicle {
    Drive driveStrategyObj;
    public Vehicle(Drive driveStrategyObj) {
        this.driveStrategyObj = driveStrategyObj;
    }
    public void drive(){
        driveStrategyObj.drive();
    }
}
