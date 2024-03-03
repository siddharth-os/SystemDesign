import Strategy.NormalDrive;

public class DeliveryTruck extends Vehicle{

    public DeliveryTruck() {
        super(new NormalDrive());
    }
}
