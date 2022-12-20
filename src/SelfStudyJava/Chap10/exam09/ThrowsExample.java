package SelfStudyJava.Chap10.exam09;

public class ThrowsExample{
    public static void main(String[] args) {

        try {
            findClass();
        } catch (ClassNotFoundException e) {
            System.out.println("클래스가 존재하지 않습니다.");
            //printStackTrace() 을 사용하여 어떤 에러메세지가 발생하는지 확인 가능. 개발단계에서만 사용하고 개발완료시 삭제
            e.printStackTrace();
        }

    }

    public static void findClass() throws ClassNotFoundException{
        Class clazz = Class.forName("java.lang.String");
    }

}
