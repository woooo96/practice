package Chap03;
import java.lang.Math;

public class test4 {
    public static void main(String[] args) {
        char a = '.';
        char z = 'z';
        char A = 'A';
        char Z = 'Z';
        String b= "a";
        String c= "C";
        String bc = b+c;
        String s = "H e l l ohow are you";
        s=s.replaceAll("are","hihi");
        int[][] arr1 = new int[5][5];
        System.out.println(arr1[1][0]);

        System.out.println(s);

        System.out.println(s.charAt(1));


        System.out.println((int)a+" "+(int)z+" "+(int)A+" "+(int)Z);
    }
}