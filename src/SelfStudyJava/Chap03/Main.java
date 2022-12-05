//package SelfStudyJava.Chap03;
//import java.util.Arrays;
//public class Main {
//    public String solution(String s) {
//        String answer = "";
//        String[] sArray = s.split(" ");
//        Arrays.sort(sArray);
//
//        String min, max;
//
//        int i = 0;
//
//        while (true) {
//            if (sArray[0] == "0" || sArray[0] == "1") {
//                min = sArray[i];
//                break;
//            } else {
//                for (int j = 2; j < Integer.parseInt(sArray[i]); j++) {
//                    if (Integer.parseInt(sArray[i]) % j == 0) {
//                        min = sArray[i];
//                        break;
//                    }
//                }
//            }
//            i++;
//        }
//
//        while (true) {
//            for (i = sArray.length - 1; i >= 0; i--) {
//                int count = 0;
//                for (int j = 2; j < Integer.parseInt(sArray[i]); j++) {
//                    if (Integer.parseInt(sArray[i]) % j == 0) {
//                        break;
//                    } else if (Integer.parseInt(sArray[i]) % j != 0) {
//                        count++;
//                    }
//                }
//                if (count > 0) {
//                    if (Integer.parseInt(max)>Integer.parseInt(sArray[i]){
//
//
//                    }
//
//                }
//            }
//        }
//
//        return answer;
//    }
//
//    public static void main(String[] args) {
//        Main method = new Main();
//        String s = "97 75 88 99 95 92 73";
//        System.out.println(method.solution(s));
//    }
//}