import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[] dX = { 1, -1, 0, 0 };
    static int[] dY = { 0, 0, 1, -1 };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        char[][] map = new char[n][m];
        boolean[][] visited = new boolean[n][m];
        int startX = 0;
        int startY = 0;
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < m; j++) {
                map[i][j] = str.charAt(j);
                if (str.charAt(j) == 'I') {
                    startX = i;
                    startY = j;
                }
            }
        }
        int num = bfs(map, visited, startX, startY, n, m);
        System.out.println(num == 0 ? "TT" : num);

    }

    private static int bfs(char[][] map, boolean[][] visited, int startX, int startY, int n, int m) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] { startX, startY });
        visited[startX][startY] = true;

        int cnt = 0;

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int x = curr[0];
            int y = curr[1];
            for (int i = 0; i < 4; i++) {
                int newX = x + dX[i];
                int newY = y + dY[i];

                if (newX >= 0 && newX < n && newY >= 0 && newY < m && !visited[newX][newY]) {
                    visited[newX][newY] = true;
                    if (map[newX][newY] == 'P') {
                        cnt++;
                    }
                    if (map[newX][newY] == 'O' || map[newX][newY] == 'P') {
                        queue.add(new int[] { newX, newY });
                    }
                }
            }
        }
        return cnt;
    }
}