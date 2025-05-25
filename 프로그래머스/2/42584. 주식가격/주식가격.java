import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < prices.length; i++) {
            while (!stack.isEmpty() && prices[stack.peek()] > prices[i]) {
                int prev = stack.pop();
                answer[prev] = i - prev;
            }

            stack.push(i);
        }

        while (!stack.isEmpty()) {
            int prev = stack.pop();
            answer[prev] = (answer.length - 1) - prev;
        }
        return answer;
    }
}