import java.util.*;

class Solution {
    public int solution(int[] numbers, int target) {
        class Node {
            int index;
            int sum;

            Node(int index, int sum) {
                this.index = index;
                this.sum = sum;
            }
        }

        int answer = 0;
        Queue<Node> queue = new LinkedList<>();

        queue.add(new Node(0, 0));

        while (!queue.isEmpty()) {
            Node current = queue.poll();

            if (current.index == numbers.length) {
                if (current.sum == target) {
                    answer++;
                }
            } else {
                int currentNumber = numbers[current.index];
                queue.add(new Node(current.index + 1, current.sum + currentNumber));
                queue.add(new Node(current.index + 1, current.sum - currentNumber));
            }
        }

        return answer;
    }
}