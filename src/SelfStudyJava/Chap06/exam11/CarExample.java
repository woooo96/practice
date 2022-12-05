package SelfStudyJava.Chap06.exam11;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.setSpeed(60);
        System.out.println(myCar.getSpeed());

        if (!myCar.isStop()) {
            myCar.setStop(true);
        }
        System.out.println(myCar.getSpeed());
    }
}
