package SelfStudyJava.Chap06.exam6;

public class CalculatorExample {
    public static void main(String[] args) {
        Calculator myCalc = new Calculator();
        double result1 = myCalc.areaRectangle(10);
        double result2 = myCalc.areaRectangle(5.5, 4.5);
        System.out.println(result1);
        System.out.println(result2);

    }
}
