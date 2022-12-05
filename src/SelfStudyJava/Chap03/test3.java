package SelfStudyJava.Chap03;

public class test3 {
    public static void main(String[] args) {
        int[] array = {1,3,9,3,4,4,4};
        int max_array = Integer.MIN_VALUE;
        int max = 0;
        int answer = 0;
        int double_max = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max_array) {
                max_array = array[i];
            }
        }
        int[] index = new int[max_array + 1];

        for (int i = 0; i < array.length; i++) {
            index[array[i]]++;
        }
        for (int i = 0; i < index.length; i++) {
            if (index[i] == max) {
                double_max += 1;
            } else if (index[i] > max) {
                double_max = 0;
                max = index[i];
                answer = i;
            }

        }
        if (double_max != 0) {
            answer = -1;
        }
            System.out.println(answer);
        }

    String A = "a";
    String B = "a";
    String C = new String("a");
    }

