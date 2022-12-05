package SelfStudyJava.Chap06;

public class Computer {
    //Field
    //Constructor
    //Method
    int sum1(int[] values) {
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        return sum;
    }

    int sum2(int ... values) {
        int sum2 = 0;
        for (int i = 0; i < values.length; i++) {
            sum2 += values[i];
        }
        return sum2;
    }
}

class ComputerExample {
    public static void main(String[] args) {
        Computer myCom = new Computer();
        int[] values1 = {1, 2, 3};
        int result = myCom.sum1(values1);
        System.out.println("result : " + result);

        int result2 = myCom.sum1(new int[]{1, 2, 3, 4, 5});
        System.out.println("result2 : " + result2);

        int result3 = myCom.sum2(1,2,3);
        System.out.println("result3 : " + result3);

    }
}
