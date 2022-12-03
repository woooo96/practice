package Algorithm;
import java.util.Arrays;
public class KNumber {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[3];
        int count;
        int[][] temp= new int[3][];
        for (int i=0; i<3; i++) {
            count = commands[i][1]-commands[i][0]+1;
            temp[i] = new int[count];
        }
        for (int i=0; i<temp.length; i++){
            for (int j=0; j<temp[i].length; j++) {
                temp[i][j]=array[commands[i][0]+j-1];
            }
        }



        return answer;
    }

    public static void main(String[] args) {
        KNumber k = new KNumber();
        k.solution(new int[] {1, 5, 2, 6, 3, 7, 4}, new int[][]{{2,5,3},{4,4,1},{1,7,3}});
    }
}
