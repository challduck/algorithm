
import java.io.*;
import java.util.*;

public class Main {
    static int[] dx = { 1, 0 };
    static int[] dy = { 0, 1 };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int[][] map = new int[n][n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        if (bfs(0, 0, map, n)) {
            System.out.println("HaruHaru");
        } else {
            System.out.println("Hing");
        }

    }

    static boolean bfs(int startX, int startY, int[][] map, int n) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] { startX, startY });

        boolean[][] visited = new boolean[n][n];
        visited[startX][startY] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];

            if (x == n - 1 && y == n - 1) {
                return true;
            }

            for (int i = 0; i < 2; i++) {
                int newX = x + dx[i] * map[x][y];
                int newY = y + dy[i] * map[x][y];

                if (newX >= 0 && newY >= 0 && newX < n && newY < n && !visited[newX][newY]) {
                    visited[newX][newY] = true;
                    queue.add(new int[] { newX, newY });
                }
            }
        }
        return false;
    }
}