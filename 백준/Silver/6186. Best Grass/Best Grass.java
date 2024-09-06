import java.io.*;
import java.util.*;

public class Main {
    static int[] dx = { 1, -1, 0, 0 };
    static int[] dy = { 0, 0, 1, -1 };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        char[][] map = new char[n][m];

        boolean[][] visited = new boolean[n][m];
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            map[i] = br.readLine().toCharArray();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] == '#' && !visited[i][j]) {
                    bfs(i, j, map, n, m, visited);
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }

    static void bfs(int startX, int startY, char[][] map, int n, int m, boolean[][] visited) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] { startX, startY });

        visited[startX][startY] = true;
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];

            for (int i = 0; i < 4; i++) {
                int newX = x + dx[i];
                int newY = y + dy[i];

                if (newX >= 0 && newY >= 0 && newX < n && newY < m && !visited[newX][newY] && map[newX][newY] == '#') {
                    visited[newX][newY] = true;
                    queue.add(new int[] { newX, newY });
                }
            }
        }
    }
}