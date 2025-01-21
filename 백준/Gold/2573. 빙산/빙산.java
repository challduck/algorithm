import java.io.*;
import java.util.*;

public class Main {
    static int n, m;
    static int[][] graph;
    static int[] dx = { 1, -1, 0, 0 };
    static int[] dy = { 0, 0, -1, 1 };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        graph = new int[n][m];
        boolean[][] visited = new boolean[n][m];

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
                if (graph[i][j] != 0 && graph[i][j] < min) {
                    min = graph[i][j];
                }
                if (graph[i][j] == 0) {
                    visited[i][j] = true;
                }
            }
        }

        int answer = 0;

        while (true) {
            int components = countComponents();
            if (components >= 2) {
                System.out.println(answer);
                return;
            }

            if (components == 0) {
                System.out.println(0);
                return;
            }

            meltIceberg();
            answer++;
        }

    }

    static void meltIceberg() {
        int[][] newGraph = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (graph[i][j] > 0) {
                    int cnt = 0;

                    for (int d = 0; d < 4; d++) {
                        int newX = i + dx[d];
                        int newY = j + dy[d];

                        if (newX >= 0 && newX < n && newY >= 0 && newY < m && graph[newX][newY] == 0) {
                            cnt++;
                        }
                    }

                    newGraph[i][j] = Math.max(0, graph[i][j] - cnt);
                }
            }
        }

        graph = newGraph;
    }

    static int countComponents() {
        boolean[][] visited = new boolean[n][m];
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (graph[i][j] > 0 && !visited[i][j]) {
                    bfs(i, j, visited);
                    count++;
                }
            }
        }

        return count;
    }

    private static void bfs(int x, int y, boolean[][] visited) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] { x, y });
        visited[x][y] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();

            for (int d = 0; d < 4; d++) {
                int newX = current[0] + dx[d];
                int newY = current[1] + dy[d];

                if (newX >= 0 && newX < n && newY >= 0 && newY < m && graph[newX][newY] > 0 && !visited[newX][newY]) {
                    visited[newX][newY] = true;
                    queue.offer(new int[] { newX, newY });
                }
            }
        }
    }
}
