import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int n, m;
    static boolean[] visited;
    static int[] board;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        board = new int[101];
        visited = new boolean[101];
        for (int i = 1; i <= 100; i++) {
            board[i] = i;
        }

        for (int i = 0; i < n + m; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            board[u] = v;
        }

        bfs();
    }

    private static void bfs() {
        Queue<int[]> queue = new LinkedList<>();
        int cnt = Integer.MAX_VALUE;
        queue.add(new int[] { 1, 0 });

        while (!queue.isEmpty()) {
            int[] currnet = queue.poll();
            int idx = currnet[0];
            int dist = currnet[1];

            if (idx == 100) {
                System.out.println(dist);
                return;
            }

            for (int i = 1; i <= 6; i++) {
                int newIdx = idx + i;

                if (newIdx < 101 && !visited[newIdx]) {
                    visited[newIdx] = true;
                    queue.add(new int[] { board[newIdx], dist + 1 });
                }
            }
        }
        System.out.println(cnt);
    }
}