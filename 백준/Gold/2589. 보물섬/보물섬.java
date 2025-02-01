import java.io.*;
import java.util.*;

public class Main {
    static int[] dx = { -1, 1, 0, 0 };
    static int[] dy = { 0, 0, 1, -1 };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] graph = new int[n][m];

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < m; j++) {
                if (str.charAt(j) == 'L') {
                    graph[i][j] = 1;
                }
            }
        }

        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (graph[i][j] == 1) {
                    result = Math.max(result, bfs(graph, n, m, i, j));
                }
            }
        }
        System.out.println(result);

    }

    private static int bfs(int[][] graph, int n, int m, int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[n][m];

        queue.offer(new int[] { x, y, 0 });
        visited[x][y] = true;
        int result = 0;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int currentX = current[0];
            int currentY = current[1];
            int dist = current[2];

            result = Math.max(result, dist);

            for (int i = 0; i < 4; i++) {
                int newX = currentX + dx[i];
                int newY = currentY + dy[i];

                if (newX >= 0 && newX < n && newY >= 0 && newY < m && !visited[newX][newY] && graph[newX][newY] == 1) {
                    visited[newX][newY] = true;
                    queue.offer(new int[] { newX, newY, dist + 1 });
                }
            }
        }

        return result;
    }
}