package Algorithm;

import java.util.ArrayList;


public class Hamburger {
    public int solution(int[] ingredient) {
        int answer = 0;
        ArrayList<Integer> hamburger = new ArrayList<>();
        for (int i= 0;  i< ingredient.length; i++) {
            hamburger.add(ingredient[i]);

            if(hamburger.size()>3 && hamburger.get(hamburger.size()-4)==1 && hamburger.get(hamburger.size()-3)==2 && hamburger.get(hamburger.size()-2)==3 && hamburger.get(hamburger.size()-1)==1) {
                answer+=1;

                for (int j = 0; j < 4; j++) {
                    hamburger.remove(hamburger.size()-1);
                }

            }
        }
        return answer;
    }


    public static void main(String[] args) {
        Hamburger h = new Hamburger();
        h.solution(new int[]{1, 2, 1, 1, 1, 1, 1, 2, 3, 1, 3, 1, 1});
    }
}
