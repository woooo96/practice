package Algorithm;

public class RemainderOne {
    public int solution(int n) {
        for (int i = 1; i < n; i++) {
            if(n%i==1) {
                return i;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        RemainderOne r = new RemainderOne();
        r.solution(10);
    }
}
