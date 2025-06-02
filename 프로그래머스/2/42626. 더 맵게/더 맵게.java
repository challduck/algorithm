import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int item : scoville) {
            pq.add(item);
        }
        
        while (pq.size() >= 2) {
            if (pq.peek() >= K){
                break;
            }
            
            int first = pq.poll();
            int second = pq.poll();
            
            pq.add(first + (second * 2));
            answer++;
        }
        
        while (!pq.isEmpty()){
            int temp = pq.poll();
            if (temp < K){
                return -1;
            }
        }
        return answer;
    }
}