import java.util.*;

class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;

        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                bfs(computers, visited, i);
                answer++;
            }
        }
        return answer;
    }

    private void bfs(int[][] computers, boolean[] visited, int i) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(i);
        visited[i] = true;
        while (!queue.isEmpty()) {
            int current = queue.poll();
            for (int j = 0; j < computers.length; j++) {
                if (computers[current][j] == 1 && !visited[j]) {
                    queue.offer(j);
                    visited[j] = true;
                }
            }
        }
    }
}