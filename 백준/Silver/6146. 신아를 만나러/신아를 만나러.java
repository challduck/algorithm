import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[] dx = { 1, -1, 0, 0 };
    static int[] dy = { 0, 0, 1, -1 };
    static final int absolute = 500;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        boolean[][] visited = new boolean[1002][1002];
        int[][] graph = new int[1002][1002];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a + absolute][b + absolute] = -1;
        }

        System.out.println(bfs(graph, visited, x, y, n));
    }

    private static int bfs(int[][] graph, boolean[][] visited, int end_x, int end_y, int n) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] { absolute, absolute, 0 });

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            int dist = current[2];

            if (x == end_x + absolute && y == end_y + absolute) {
                return dist;
            }

            for (int i = 0; i < dx.length; i++) {
                int new_x = x + dx[i];
                int new_y = y + dy[i];
                if (new_x >= 0 && new_y >= 0 && new_x <= 1000 && new_y <= 1000
                        && !visited[new_x][new_y] && graph[new_x][new_y] != -1) {
                    queue.add(new int[] { new_x, new_y, dist + 1 });
                    visited[new_x][new_y] = true;
                }
            }
        }
        return -1;
    }
}