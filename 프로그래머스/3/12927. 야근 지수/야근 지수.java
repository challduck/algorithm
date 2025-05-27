import java.util.*;

class Solution {
    public long solution(int n, int[] works) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        long answer = 0;
        long sum = 0;
        for (int i : works) {
            pq.offer(i);
            sum += i;
        }

        if (sum <= n) {
            return 0;
        }

        for (int i = 0; i < n; i++) {
            int max = pq.poll();
            if (max > 0) {
                pq.offer(max - 1);
            } else {
                break;
            }
        }

        while (!pq.isEmpty()) {
            long temp = pq.poll();
            answer += Math.pow(temp, 2);
        }

        return answer;
    }
}