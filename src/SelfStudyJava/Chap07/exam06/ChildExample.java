package SelfStudyJava.Chap07.exam06;

public class ChildExample {
    public static void main(String[] args) {
//        Child child = new Child();
//        Parent parent = child;
//
//        parent.method1();
//        parent.method2();
//        parent.method3();

        Parent parent = new Child();
        parent.field1 = "data1";
        parent.method1();
        parent.method2();

        Child child = (Child) parent;
        child.field2="dasta2";
        child.method3();
    }
}
