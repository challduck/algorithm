import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[] dx = { 1, -1, 0, 0 };
    static int[] dy = { 0, 0, 1, -1 };

    static int cnt = 0;
    static int[][] graph;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        graph = new int[n][m];
        visited = new boolean[n][m];
        List<int[]> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
                if (graph[i][j] == 1) {
                    list.add(new int[] { i, j });
                }
            }
        }

        int cnt = bfs(list, n, m);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (graph[i][j] == 0 && !visited[i][j]) {
                    System.out.println(-1);
                    return;
                }
            }
        }
        System.out.println(cnt);
    }

    static int bfs(List<int[]> list, int n, int m) {
        Queue<int[]> queue = new LinkedList<>();
        for (int[] start : list) {
            queue.add(new int[] { start[0], start[1], 0 });
        }

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            int dist = current[2];
            cnt = Math.max(dist, cnt);

            for (int i = 0; i < dx.length; i++) {
                int newX = x + dx[i];
                int newY = y + dy[i];

                if (newX >= 0 && newY >= 0 && newX < n && newY < m && !visited[newX][newY] && graph[newX][newY] == 0) {
                    visited[newX][newY] = true;
                    queue.add(new int[] { newX, newY, dist + 1 });
                }
            }
        }
        return cnt;
    }
}