import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[] dx = { 0, 0, 1, -1 };
    static int[] dy = { 1, -1, 0, 0 };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] maze = new int[n][m];

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < m; j++) {
                maze[i][j] = str.charAt(j) - '0';
            }
        }

        System.out.println(bfs(maze, n, m));
    }

    static int bfs(int[][] maze, int n, int m) {
        boolean[][] visited = new boolean[n][m];
        Queue<int[]> queue = new LinkedList<>();

        queue.offer(new int[] { 0, 0 });
        visited[0][0] = true;

        int cnt = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            cnt++;

            for (int i = 0; i < size; i++) {
                int[] current = queue.poll();
                int x = current[0];
                int y = current[1];

                if (x == n - 1 && y == m - 1) {
                    return cnt;
                }

                for (int dir = 0; dir < 4; dir++) {
                    int newX = x + dx[dir];
                    int newY = y + dy[dir];

                    if (newX >= 0 && newY >= 0 && newX < n && newY < m && !visited[newX][newY]
                            && maze[newX][newY] == 1) {
                        queue.offer(new int[] { newX, newY });
                        visited[newX][newY] = true;
                    }
                }
            }
        }
        return -1;
    }
}