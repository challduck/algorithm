import java.util.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {};
        int total = brown + yellow;
        for (int i = 3; i <= total; i++) {
            if (total % i == 0) {
                int x = i;
                int y = total / i;
                if ((x - 2) * (y - 2) == yellow) {
                    answer = new int[] { y, x };
                    break;
                }
            }
        }
        return answer;
    }
}