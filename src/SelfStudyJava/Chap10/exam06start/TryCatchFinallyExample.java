package SelfStudyJava.Chap10.exam06start;

public class TryCatchFinallyExample {
    public static void main(String[] args) {

//        String str = null;
//        //컴파일러에서 알려주지 않는 예외
//        System.out.println(str.length());

        //일반 예 Class를 java.lang.String으로 검색해서 clazz 참조변수에 대입, 찾지 못하면 ClassNotFoundExcption(빨간줄)이 생기며 예외처리 요청
//        Class clazz = Class.forName("java.lang.String2");
//        System.out.println("정상 실행");


        //try catch 문으로 예외를 처리
        try {
            Class clazz2 = Class.forName("java.lang.String");
            System.out.println("정상 실행");
        } catch (ClassNotFoundException e) {
            System.out.println("클래스가 존재하지 않습니다.");
        }

    }
}
