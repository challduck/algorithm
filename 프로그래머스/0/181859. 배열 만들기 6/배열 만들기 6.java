import java.util.*;

class Solution {
    public int[] solution(int[] arr) {

        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < arr.length; i++) {
            if (deque.isEmpty()) {
                deque.add(arr[i]);
            } else if (!deque.isEmpty() && deque.getLast() == arr[i]) {
                deque.pollLast();
            } else if (!deque.isEmpty() && deque.getLast() != arr[i]) {
                deque.addLast(arr[i]);
            }
        }

        int[] answer = new int[deque.size()];
        if (deque.isEmpty()) {
            return new int[] { -1 };
        } else {
            for (int i = 0; i < answer.length; i++) {
                answer[i] = deque.pollFirst();
            }
        }
        return answer;
    }
}