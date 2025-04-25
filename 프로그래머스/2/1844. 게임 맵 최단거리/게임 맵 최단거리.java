import java.util.*;

class Solution {
    static int[] dx = { -1, 1, 0, 0 };
    static int[] dy = { 0, 0, -1, 1 };
    public static int solution(int[][] maps) {
        int answer = -1;

        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[maps.length][maps[0].length];
        queue.add(new int[] { 0, 0, 1 });
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int cur_x = current[0];
            int cur_y = current[1];
            int cur_dist = current[2];

            if (cur_x == maps.length - 1 && cur_y == maps[0].length - 1) {
                return cur_dist;
            }

            for (int i = 0; i < dx.length; i++) {
                int new_x = cur_x + dx[i];
                int new_y = cur_y + dy[i];

                if (new_x >= 0 && new_x < maps.length && new_y >= 0 && new_y < maps[0].length && maps[new_x][new_y] == 1
                        && !visited[new_x][new_y]) {
                    visited[new_x][new_y] = true;
                    queue.add(new int[] { new_x, new_y, cur_dist + 1 });
                }
            }
        }
        return answer;
    }
}