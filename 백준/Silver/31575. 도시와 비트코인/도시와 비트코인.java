import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[] dx = { 1, 0 };
    static int[] dy = { 0, 1 };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        boolean[][] visited = new boolean[n][m];
        int[][] map = new int[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        System.out.println(bfs(map, visited, 0, 0, n, m) ? "Yes" : "No");
    }

    private static boolean bfs(int[][] map, boolean[][] visited, int startX, int startY, int n, int m) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] { startX, startY });

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            if (x == n - 1 && y == m - 1) {
                return true;
            }

            for (int i = 0; i < dx.length; i++) {
                int newX = x + dx[i];
                int newY = y + dy[i];

                if (newX >= 0 && newY >= 0 && newX < n && newY < m && !visited[newX][newY] && map[newX][newY] == 1) {
                    visited[newX][newY] = true;
                    queue.add(new int[] { newX, newY });
                }
            }

        }
        return false;
    }
}
