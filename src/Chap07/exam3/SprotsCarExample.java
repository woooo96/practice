package Chap07.exam3;

public class SprotsCarExample {
    public static void main(String[] args) {
        SportsCar sportsCar = new SportsCar();
        sportsCar.speedUp();
        System.out.println(sportsCar.speed);
        sportsCar.stop();
        System.out.println(sportsCar.speed);
        }
    }

