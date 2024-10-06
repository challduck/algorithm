import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] maze = new int[n + 1];
        boolean[] visited = new boolean[n + 1];

        for (int i = 1; i <= n; i++) {
            int a = Integer.parseInt(st.nextToken());
            maze[i] = a;
        }
        System.out.println(bfs(maze, visited, n));
    }

    private static int bfs(int[] maze, boolean[] visited, int n) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] { 1, 0 });

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int cur_num = current[0];
            int dist = current[1];

            if (cur_num == n) {
                return dist;
            }

            for (int i = cur_num + 1; i <= Math.min(cur_num + maze[cur_num], n); i++) {
                if (!visited[i]) {
                    visited[i] = true;
                    queue.add(new int[] { i, dist + 1 });
                }
            }
        }
        return -1;
    }
}