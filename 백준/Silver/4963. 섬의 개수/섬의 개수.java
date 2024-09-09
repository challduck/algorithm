import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[] dx = { 1, -1, 0, 0, 1, -1, 1, -1 };
    static int[] dy = { 0, 0, 1, -1, 1, -1, -1, 1 };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int w = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());

            if (w == 0 && h == 0) {
                System.out.println(sb);
                break;
            }

            int[][] graph = new int[h][w];
            boolean[][] visited = new boolean[h][w];
            int cnt = 0;

            for (int i = 0; i < h; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < w; j++) {
                    graph[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            for (int i = 0; i < graph.length; i++) {
                for (int j = 0; j < graph[i].length; j++) {
                    if (!visited[i][j] && graph[i][j] == 1) {
                        bfs(graph, visited, h, w, i, j);
                        cnt++;
                    }
                }
            }
            sb.append(cnt).append("\n");
        }
    }

    private static void bfs(int[][] graph, boolean[][] visited, int n, int m, int startX, int startY) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] { startX, startY });

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];

            for (int i = 0; i < dx.length; i++) {
                int newX = x + dx[i];
                int newY = y + dy[i];

                if (newX >= 0 && newY >= 0 && newX < n && newY < m && !visited[newX][newY] && graph[newX][newY] == 1) {
                    visited[newX][newY] = true;
                    queue.add(new int[] { newX, newY });
                }
            }
        }
    }
}