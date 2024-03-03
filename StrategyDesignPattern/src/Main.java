import Strategy.NormalDrive;
import Strategy.SportsDrive;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new DeliveryTruck();
        vehicle.drive();
        Vehicle v2 = new SportsCar();
        v2.drive();
    }
}