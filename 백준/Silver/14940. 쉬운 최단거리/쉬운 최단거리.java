import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[] dx = { 1, -1, 0, 0 };
    static int[] dy = { 0, 0, 1, -1, };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] graph = new int[n][m];
        boolean[][] visited = new boolean[n][m];
        int[][] answer = new int[n][m];

        for (int i = 0; i < answer.length; i++) {
            Arrays.fill(answer[i], -1);
        }

        int startX = 0;
        int startY = 0;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
                if (graph[i][j] == 2) {
                    startX = i;
                    startY = j;
                }
                if (graph[i][j] == 0) {
                    answer[i][j] = 0;
                }
            }
        }

        bfs(graph, visited, startX, startY, n, m, answer);
    }

    static void bfs(int[][] graph, boolean[][] visited, int startX, int startY, int n, int m, int[][] answer) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] { startX, startY, 0 });

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            int dist = current[2];
            answer[x][y] = dist;

            for (int i = 0; i < dx.length; i++) {
                int newX = x + dx[i];
                int newY = y + dy[i];

                if (newX >= 0 && newY >= 0 && newX < n && newY < m && !visited[newX][newY] && graph[newX][newY] == 1) {
                    queue.add(new int[] { newX, newY, dist + 1 });
                    visited[newX][newY] = true;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[i].length; j++) {
                sb.append(answer[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
