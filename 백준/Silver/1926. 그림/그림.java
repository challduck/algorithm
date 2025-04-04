import java.io.*;
import java.util.*;

public class Main {
    static int[] dx = { -1, 1, 0, 0 };
    static int[] dy = { 0, 0, 1, -1 };

    static boolean[][] visited;
    static int[][] map;
    static int max = 0;
    static int cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        map = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!visited[i][j] && map[i][j] == 1) {
                    bfs(i, j, n, m);
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
        System.out.println(max);
    }

    private static void bfs(int i, int j, int n, int m) {
        Queue<int[]> queue = new LinkedList<>();
        int size = 1;
        queue.offer(new int[] { i, j });
        visited[i][j] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int currentX = current[0];
            int currentY = current[1];

            max = Math.max(max, size);

            for (int k = 0; k < 4; k++) {
                int newX = currentX + dx[k];
                int newY = currentY + dy[k];

                if (newX >= 0 && newX < n && newY >= 0 && newY < m && !visited[newX][newY] && map[newX][newY] == 1) {
                    visited[newX][newY] = true;
                    queue.offer(new int[] { newX, newY });
                    size++;
                }
            }
        }
    }
}