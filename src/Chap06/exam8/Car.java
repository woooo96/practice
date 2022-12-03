package Chap06.exam8;

public class Car {
    int speed;
    void run() {
        System.out.println(speed+"으로 달립니다.");
    }


    public static void main(String[] args) {
//        speed = 60;   static으로 선언된 main 메소드에서는 객체가 생성되지 않아도 사용할 수 있어야 하는데 사용 불가능
//        run();        static으로 선언된 main 메소드에서는 객체가 생성되지 않아도 사용할 수 있어야 하는데 사용 불가능
    }
}
