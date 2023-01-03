package Algorithm;

public class NMultiple {
    public int[] solution(int n, int[] numlist) {
        int[] answer = {};
        int count=0;

        for (int i = 0; i < numlist.length; i++) {
            if(numlist[i]%n==0) {
                count++;
            }
        }

        answer = new int[count];
        for (int i = 0, j=0; i < numlist.length; i++) {
            if(numlist[i]%n==0) {
                answer[j]=numlist[i];
                j++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        NMultiple n = new NMultiple();
        n.solution(12, new int[]{2, 100, 120, 600, 12, 12});
    }
}




