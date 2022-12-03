package Chap03;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int[] array = {9, -1, 39, -20, 8};
        int temp=0;
        for(int i=0; i<array.length; i++) {
            for (int j=i+1; j<array.length; j++) {
                if (array [i] > array[j]) {
                    temp=array[j];
                    array [j] = array[i];
                    array [i] = temp;
                }
            }
        }
        int num=array.length/2;
        System.out.print(array[num]);

    }
}



