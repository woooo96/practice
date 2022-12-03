package Algorithm;

public class DivisorCnt {
    public int solution(int n) {
        int answer = 0;
        for (int i=1; i<=n/2; i++) {
            if (n%i==0) {
                answer+=i;
            }
        }
        System.out.println(answer+n);
        return answer+n;
    }

    public static void main(String[] args){
        DivisorCnt d = new DivisorCnt();
        d.solution(5);
    }
}
