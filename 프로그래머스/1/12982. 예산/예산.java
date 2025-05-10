import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int cnt = 0;
        int total = 0;

        for (int request : d) {
            total += request;
            if (total > budget) {
                break;
            }
            cnt++;
        }
        return cnt;
    }
}