package SelfStudyJava.Chap08.exam09;

public class VehicleExample {
    public static void main(String[] args) {
        Vehicle vehicle = new Bus();
        vehicle.run();

        Bus bus = (Bus) vehicle;
        bus.checkFare();
    }
}
