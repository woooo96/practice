package SelfStudyJava.Chap07.exam10;

public class InstanceofExample {
    public static void main(String[] args) {
        Parent parentA = new Child();
        method1(parentA);

        Parent parentB = new Parent();
        method1(parentB);


    }

    public static void method1(Parent parent) {
        if(parent instanceof Child) {
            Child child = (Child) parent;
            System.out.println("method1 - child로 변환 성공");
        } else {
            System.out.println("method1 = Child로 변환되지 않음.");
        }
    }
}
