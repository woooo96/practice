package Algorithm;

import java.util.Arrays;

public class MaxAndMin {
    public String solution(String s) {
        String answer = "";
        String[] sArray = s.split(" ");
        int[] iArray = new int[sArray.length];
        for (int i = 0; i < sArray.length; i++) {
            iArray[i] = Integer.parseInt(sArray[i]);
        }
        Arrays.sort(iArray);

        answer = iArray[0]+" "+iArray[iArray.length-1];
        return answer;
    }


    public static void main(String[] args) {
        MaxAndMin m = new MaxAndMin();
        m.solution("-1 -1");
    }
}
