import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[] dr = { -2, -2, 0, 0, 2, 2 };
    static int[] dc = { -1, 1, -2, 2, -1, 1 };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        boolean[][] visited = new boolean[n][n];
        int r1 = Integer.parseInt(st.nextToken());
        int c1 = Integer.parseInt(st.nextToken());
        int r2 = Integer.parseInt(st.nextToken());
        int c2 = Integer.parseInt(st.nextToken());

        System.out.println(bfs(n, r1, c1, r2, c2, visited));
    }

    private static int bfs(int n, int r1, int c1, int r2, int c2, boolean[][] visited) {
        Queue<int[]> queue = new LinkedList<>();
        visited[r1][c1] = true;
        queue.add(new int[] { r1, c1, 0 });

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int r = current[0];
            int c = current[1];
            int dist = current[2];

            if (r == r2 && c == c2) {
                return dist;
            }

            for (int i = 0; i < dr.length; i++) {
                int new_r = r + dr[i];
                int new_c = c + dc[i];

                if (new_r >= 0 && new_c >= 0 && new_r < n && new_c < n && !visited[new_r][new_c]) {
                    queue.add(new int[] { new_r, new_c, dist + 1 });
                    visited[new_r][new_c] = true;
                }
            }
        }

        return -1;
    }
}
