import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);

        /*
         * 1, 1, 1, /2, 2, 3, 3
         * 1,1,2,/2,2,2,/4,4,4,/4,4,4
         */
        int n = score.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = score[i];
            score[i] = score[n - i - 1];
            score[n - i - 1] = temp;
        }
        for (int i = m - 1; i < n; i += m) {
            answer += score[i] * m;
        }
        return answer;
    }
}