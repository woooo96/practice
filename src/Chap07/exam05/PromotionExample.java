package Chap07.exam05;

public class PromotionExample {
    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

        A a1 = b;
        A a2 = c;
        A a3 = d;
        A a4 = e;

        B b1 = d;
        C c1 = e;

//        B b2 = e; e 타입은 b타입을 상속받지 않아 에러가 발생한다.
//        C c2 = d; d 타입은 c타입을 상속받지 않아 에러가 발생한다.

    }
}
