import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[] dx = { 1, -1, 0, 0 };
    static int[] dy = { 0, 0, 1, -1, };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int r = 5;
        int c = 5;

        int[][] graph = new int[r][c];
        boolean[][] visited = new boolean[r][c];

        int endX = 0;
        int endY = 0;
        for (int i = 0; i < r; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < c; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
                if (graph[i][j] == 1) {
                    endX = i;
                    endY = j;
                }
            }
        }
        st = new StringTokenizer(br.readLine());

        int startX = Integer.parseInt(st.nextToken());
        int startY = Integer.parseInt(st.nextToken());
        System.out.println(bfs(graph, visited, startX, startY, endX, endY, r, c));
    }

    static int bfs(int[][] graph, boolean[][] visited, int startX, int startY, int endX, int endY, int n, int m) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] { startX, startY, 0 });

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            int dist = current[2];

            if (x == endX && y == endY) {
                return dist;
            }

            for (int i = 0; i < dx.length; i++) {
                int newX = x + dx[i];
                int newY = y + dy[i];

                if (newX >= 0 && newY >= 0 && newX < n && newY < m && !visited[newX][newY] && graph[newX][newY] != -1) {
                    queue.add(new int[] { newX, newY, dist + 1 });
                    visited[newX][newY] = true;
                }
            }
        }
        return -1;
    }
}