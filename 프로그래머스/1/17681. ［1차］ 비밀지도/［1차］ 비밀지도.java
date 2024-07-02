import java.util.*;
class Solution {

   public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            Arrays.fill(arr[i], 0);
        }

        for (int i = 0; i < arr1.length; i++) {
            String str = String.format("%"+n+"s", Integer.toBinaryString(arr1[i]));
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == '1') {
                    arr[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            String str = String.format("%" + n + "s", Integer.toBinaryString(arr2[i]));
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == '1') {
                    arr[i][j] = 1;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == 1) {
                    sb.append("#");
                } else {
                    sb.append(" ");
                }
            }
            answer[i] = sb.toString();
        }
        return answer;
    }

}