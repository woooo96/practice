package Algorithm;

public class Star {
    public void solution(int star) {
        // 코드 작성
        for(int i=1; i<=star; i++) {
            for (int j=1; j<=star-i; j++) {
                System.out.print(" ");
                }
            for (int k=1; k<=i*2-1; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Star method = new Star();
        int star = 9;
        method.solution(star);
    }
}
