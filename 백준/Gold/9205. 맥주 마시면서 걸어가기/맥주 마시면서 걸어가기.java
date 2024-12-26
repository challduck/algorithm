import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st;
            boolean[] visited = new boolean[n + 2];
            int[][] graph = new int[n + 2][2];

            for (int j = 0; j < n + 2; j++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                graph[j][0] = x;
                graph[j][1] = y;
            }

            if (bfs(visited, graph, n)) {
                sb.append("happy").append("\n");
            } else {
                sb.append("sad").append("\n");
            }
        }
        System.out.print(sb);
    }

    private static boolean bfs(boolean[] visited, int[][] graph, int n) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        visited[0] = true;

        while (!queue.isEmpty()) {
            int current = queue.poll();
            int current_x = graph[current][0];
            int current_y = graph[current][1];

            for (int i = 0; i < n + 2; i++) {
                if (!visited[i]) {
                    int target_x = graph[i][0];
                    int target_y = graph[i][1];
                    int dist = Math.abs(current_x - target_x) + Math.abs(current_y - target_y);

                    if (dist <= 1000) {
                        queue.add(i);
                        visited[i] = true;

                        if (i == n + 1) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}