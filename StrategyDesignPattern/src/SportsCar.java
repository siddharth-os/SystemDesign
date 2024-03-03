import Strategy.Drive;
import Strategy.SportsDrive;

public class SportsCar extends Vehicle{
    public SportsCar() {
        super(new SportsDrive());
    }
}
