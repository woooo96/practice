package SelfStudyJava.Chap06.exam5;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.keyTurnOn();
        myCar.run();
        int result = myCar.getSpeed();
        System.out.println("현재속도: "+result);
    }
}
