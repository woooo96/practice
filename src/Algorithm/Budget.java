package Algorithm;
import java.util.Arrays;
public class Budget {
    public int solution(int[] d, int budget) {
        int answer=0;
        Arrays.sort(d);
        int sum=0;
        for (int i=0; i<d.length; i++) {
            sum+=d[i];
            if (sum <= budget) answer+=1;
            else break;
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        Budget b = new Budget();
        b.solution(new int[] {1,3,2,5,4},9);
    }
}
