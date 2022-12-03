package Algorithm;

public class MaxNumSearch {
    public void solution(int[][] arr1) {
        int[][] answer = new int[5][5];
        int[][] check = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 0 && j == 0) {
                    if (arr1[i][j] > arr1[i + 1][j] && arr1[i][j] > arr1[i][j + 1]) {
                        System.out.print("* ");
                    } else {
                        System.out.print(arr1[i][j]);
                    }
                } else if (i == 4 && j == 4) {
                    if (arr1[i][j] > arr1[i - 1][j] && arr1[i][j] > arr1[i][j - 1]) {
                        System.out.print("*");
                    } else {
                        System.out.print(arr1[i][j]);
                    }
                } else if (i == 0) {
                    if (arr1[i][j] > arr1[i + 1][j] && arr1[i][j] > arr1[i][j - 1] && arr1[i][j] > arr1[i][j + 1]) {
                        System.out.print("*");
                    } else {
                        System.out.print(arr1[0][j]);
                    }
                } else if (i == 4) {
                    if (arr1[i][j] > arr1[i - 1][j] && arr1[i][j] > arr1[i][j - 1] && arr1[i][j] > arr1[i][j + 1]) {
                        System.out.print("*");
                    } else {
                        System.out.print(arr1[i][j]);
                    }
                } else if (j == 0) {
                    if (arr1[i][j] > arr1[i][j + 1] && arr1[i][j] > arr1[i - 1][j] && arr1[i][j] > arr1[i + 1][j]) {
                        System.out.print("*");
                    } else {
                        System.out.print(arr1[i][j]);
                    }
                } else if (j == 4) {
                    if (arr1[i][j] > arr1[i][j - 1] && arr1[i][j] > arr1[i - 1][j] && arr1[i][j] > arr1[i + 1][j]) {
                        System.out.print("*");
                    } else {
                        System.out.print(arr1[i][j]);
                    }
                } else
                    if (arr1[i][j] > arr1[i-1][j] && arr1[i][j] > arr1[i+1][j] && arr1[i][j] > arr1[i][j-1] && arr1[i][j] > arr1[i][j+1]) {
                        System.out.print("*");
                    } else {
                        System.out.print(arr1[i][j]);
                    }
            }
            System.out.println("");
        }
    }
        public static void main (String[]args){
            MaxNumSearch method = new MaxNumSearch();
            int[][] arr1 = {{7, 4, 6, 5, 9}, {6, 1, 3, 4, 5}, {4, 8, 5, 6, 9}, {1, 3, 0, 6, 4}, {6, 4, 8, 1, 7}};

            method.solution(arr1);
        }
    }

