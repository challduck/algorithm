import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[] dx = { -1, -1, -1, 0, 0, 1, 1, 1 };
    static int[] dy = { -1, 0, 1, -1, 1, -1, 0, 1 };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] graph = new int[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        System.out.println(bfs(n, m, graph));
    }

    private static int bfs(int n, int m, int[][] graph) {
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[n][m];
        int answer = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (graph[i][j] == 1) {
                    queue.add(new int[] { i, j , 0});
                    visited[i][j] = true;
                }
            }
        }

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int cur_x = current[0];
            int cur_y = current[1];
            int dist = current[2];
            for (int i = 0; i < 8; i++) {
                int new_x = cur_x + dx[i];
                int new_y = cur_y + dy[i];

                if(graph[cur_x][cur_y] == 0){
                    answer = Math.max(answer, dist);
                }

                if (new_x >= 0 && new_y >= 0 && new_x < n && new_y < m && !visited[new_x][new_y]) {
                    visited[new_x][new_y] = true;
                    queue.add(new int[] { new_x, new_y , dist + 1});
                }
            }
        }

        return answer;
    }
}