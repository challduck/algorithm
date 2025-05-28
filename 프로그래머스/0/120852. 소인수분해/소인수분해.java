import java.util.*;

class Solution {
    public int[] solution(int n) {
        Map<Integer, Integer> map = new HashMap<>();
        int temp = 2;
        int num = n;
        while (true) {
            if (num % temp == 0) {
                num /= temp;
                map.putIfAbsent(temp, 0);
            } else if (temp == n) {
                break;
            } else {
                temp++;
            }
        }
        Set<Integer> set = map.keySet();
        int[] answer = new int[set.size()];
        int idx = 0;
        for (int i : set) {
            answer[idx++] = i;
        }
        Arrays.sort(answer);
        return answer;
    }
}