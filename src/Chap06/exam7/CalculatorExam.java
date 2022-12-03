package Chap06.exam7;

public class CalculatorExam {
    public static void main(String[] args) {
        double result1 = 10 * 10 * Calculator.pi;
        int result2 = Calculator.plus(10, 5);
        int result3 = Calculator.minus(15,5);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
