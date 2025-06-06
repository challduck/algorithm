import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        Stack<Integer> queue = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if (flag[i]) {
                for (int j = 0; j < arr[i] * 2; j++) {
                    queue.add(arr[i]);
                }
            } else {
                for (int j = 0; j < arr[i]; j++) {
                    queue.pop();
                }
            }
        }
        int[] answer = new int[queue.size()];
        int idx = queue.size() - 1;
        while (!queue.isEmpty()) {
            answer[idx] = queue.pop();
            idx--;
        }
        return answer;
    }
}