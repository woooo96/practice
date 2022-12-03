package Chap06.exam9;

public class Singleton {
    private static Singleton s = new Singleton();//static으로 선언해서 아래 get()메소드에서 객체 생성 없이도 Singleton 타입 s를 반환할 수 있도록 함
    private Singleton() {}; //클래스내부에서만 객체를 생성할 수 있도록 생성자에 private 접근제한자 붙임.


    static Singleton getInstance() {
        return s;
    }
    // 외부에서 생성된 Singleton 객체에 접근하기 위해서는 static으로 선언된 get()메소드를 이용할 수 밖에 없다.
    // 외부에서 Singleton.getInstance()를 통해 객체를 가져오되, 생성된 객체는 하나이기 때문에 단 하나의 객체만 참조가 가능하다.
}
