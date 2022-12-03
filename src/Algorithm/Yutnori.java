package Algorithm;

public class Yutnori {
    public String solution(int[] arr1) {
        String answer = "";
        int count=0;
        for (int i=0; i<arr1.length; i++) {
            if (arr1[i]==0) {
                count++;
            }
        }
        switch (count){
            case 0:
                answer="모";
                break;
            case 1:
                answer="도";
                break;
            case 2:
                answer="개";
                break;
            case 3:
                answer="걸";
                break;
            case 4:
                answer="윷";
                break;
        }
        return answer;
    }

    public static void main(String[] args) {
        Yutnori method = new Yutnori();
        int[] arr1 = {1, 1, 1, 1};
        System.out.println(method.solution(arr1));
    }

}
