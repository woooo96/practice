package SelfStudyJava.Chap06;

public class Calculator {
    void powerOn() {
        System.out.println("전원을 켭니다");
    }

    int plus(int x, int y) {
        int result=x+y;
        return result;
    }

    double divide(int x, int y) {
        double result = (double)x / y;
        return result;
    }
    void powerOff(){
        System.out.println("전원을 끕니다.");
    }
}

class CalculatorExample {
    public static void main (String[] args) {
        Calculator myCalc = new Calculator();
        myCalc.powerOn();
        int result = myCalc.plus(1,3);
        System.out.println(result);
        double result2 = myCalc.divide(7,2);
        System.out.println(result2);
        myCalc.powerOff();

    }
}
