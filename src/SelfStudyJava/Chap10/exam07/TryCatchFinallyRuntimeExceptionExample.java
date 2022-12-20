package SelfStudyJava.Chap10.exam07;

public class TryCatchFinallyRuntimeExceptionExample {

    public static void main(String[] args) {

        String data1 = null;
        String data2 = null;

        //ArrayIndexOutOfBoundsException 발생
        try {
            data1 = args[0];
            data2 = args[1];
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("실행 매개값의 수가 부족합니다.");
            return;
        }

        //입력받은 매개값을 통해 문자열이 들어올 경우 NumberFormatException 발생
        try {
            int value1 = Integer.parseInt(data1);
            int value2 = Integer.parseInt(data2);
        } catch(NumberFormatException e) {
            System.out.println("숫자로 변환할 수 없습니다.");
        } finally {
            System.out.println("다시 실행하세요.");
        }
    }
}
