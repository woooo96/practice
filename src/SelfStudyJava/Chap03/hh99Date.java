package SelfStudyJava.Chap03;

public class hh99Date {
    public String solution(int month, int day) {
        String answer = "";
        //monthDay배열을 생성하여 각 월들의 일 수를 입력
        int[] monthDay = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int sum=0;
        int hh99=98;

        // 입력받은 (month)월 (day)일이 총 며칠인지 확인
        for (int i=0; i<month-1; i++) {
            sum+=monthDay[i];
        }
        sum+=day;
        // 항해99 수료일은 +98를 해줘야 하기 때문에 sum+98한 값을 hh99변수에 입력
        hh99+=sum;
        // hh99에 입력받은 값이 365가 넘을 경우 1월부터 다시 세어야 하기 때문에 hh99변수에 -365
        if(hh99 > 365) {
            hh99-=365;
        }

        int i=0;
        // while문을 돌려서 hh99변수로 입력받은 총 일수를 몇월 며칠인지 구함
        while (true) {
            // hh99-monthDay[i]의 값이 0보다 작을경우는 해당월이라는 말과 같기 때문에
            // (ex hh99의 값이 28일 경우 1월의 총 일수인 31일을 빼면 -가 되므로, monthDay[i]와 동일한 월일 때만 -값이 나오게 됩니다.)
            if(hh99-monthDay[i] <= 0) {
                //배열의 경우 index가 0부터 시작하기 때문에 i+1을 해준 값을 answer 변수에 저장
                answer=(i+1)+"월 "+(hh99)+"일";
                break;
            }
            hh99-=monthDay[i];
            i++;
        }
        return answer;
    }

    public static void main(String[] args) {
        hh99Date method = new hh99Date();
        System.out.println(method.solution(1, 18));
    }
}
