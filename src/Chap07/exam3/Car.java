package Chap07.exam3;

public class Car {
    public int speed=0;

    public void speedUp() {
        this.speed += 1;
    }

    public final void stop() {
        System.out.println("차를 멈춤");
        speed=0;
    }
}
