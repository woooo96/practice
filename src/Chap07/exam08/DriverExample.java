package Chap07.exam08;

public class DriverExample {
    public static void main(String[] args) {
        Driver driver = new Driver();
        Vehicle vehicle = new Vehicle();

        driver.drive(vehicle);
        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        driver.drive(bus);
    }
}
