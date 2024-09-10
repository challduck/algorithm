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

        int[][] map = new int[n][m];
        boolean[][] visited = new boolean[n][m];

        int startX = 0;
        int startY = 0;
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < m; j++) {
                map[i][j] = str.charAt(j) - '0';
                if (map[i][j] == 2) {
                    startX = i;
                    startY = j;
                }
            }
        }
        int answer = bfs(map, visited, n, m, startX, startY);

        if (answer == -1) {
            System.out.println("NIE");
        } else {
            System.out.println("TAK");
            System.out.println(answer);
        }

    }

    static int bfs(int[][] map, boolean[][] visited, int n, int m, int startX, int startY) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] { startX, startY, 0 });

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            int dist = current[2];

            if (map[x][y] >= 3) {
                return dist;
            }

            for (int i = 0; i < dx.length; i++) {
                int newX = x + dx[i];
                int newY = y + dy[i];

                if (newX >= 0 && newY >= 0 && newX < n && newY < m && !visited[newX][newY] && map[newX][newY] != 1) {
                    visited[newX][newY] = true;
                    queue.add(new int[] { newX, newY, dist + 1 });
                }
            }
        }

        return -1;
    }

}