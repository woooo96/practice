package Chap06.exam9;

public class SingletonExample {
    public static void main(String[] args) {
//        Singleton obj1 = new Singleton();
//        Singleton obj2 = new Singleton();
//        Singleton 객체 생성자가 private 이므로 외붸서 객체 생성이 불가능함

        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        if(obj1==obj2) {
            System.out.println("같은 싱글톤 객체입니다.");
        } else {
            System.out.println("다른 싱글톤 객체 입니다.");
        }

    }
}
