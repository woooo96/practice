package Algorithm;

import java.util.Arrays;

public class MaxNum {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);

        return answer=(numbers[numbers.length-1]*numbers[numbers.length-2]);
    }


    public static void main(String[] args) {
        MaxNum m = new MaxNum();
        m.solution(new int[] {1, 2, 3, 4, 5});


    }
}
