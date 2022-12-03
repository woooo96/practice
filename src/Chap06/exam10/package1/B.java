package Chap06.exam10.package1;

public class B {
    public B() {
        A a = new A();
//        a.field3 = 2;

        a.method1();
        a.method2();
//        a.method3();
        System.out.println(a.field1+" "+a.field2);
        }

    public static void main(String[] args) {
        B b = new B();

        System.out.println();
    }
}


