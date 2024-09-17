import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    
    // 나이트가 이동할 수 있는 8가지 방향
    static final int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
    static final int[] dy = {1, 2, 2, 1, -1, -2, -2, -1};
    static int startX, startY, n, m, endX, endY;
    static int[][] graph;
    static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        graph = new int[n][m];
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < m; j++) {
                char ch = str.charAt(j);
                if (ch == 'K') {
                    startX = i;
                    startY = j;
                    graph[i][j] = 1;
                } else if (ch == '.') {
                    graph[i][j] = 0;
                } else if (ch == '#') {
                    graph[i][j] = -1;
                } else if (ch == 'X') {
                    graph[i][j] = 2;
                    endX = i;
                    endY = j;
                }
            }
        }

        System.out.println(bfs());
    }

    static int bfs(){
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[n][m];
        queue.add(new int[]{startX, startY, 0});

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            int dist = current[2];
            if (endX == x && endY == y) {
                return dist;
            }
            for (int i = 0; i < dx.length; i++) {
                int newX = x + dx[i];
                int newY = y + dy[i];

                if (newX >= 0 && newY >= 0 && newX < n && newY < m && !visited[newX][newY] && graph[newX][newY] != -1) {
                    visited[newX][newY] = true;
                    queue.add(new int[]{newX, newY, dist+1});
                }
            }
        }
        return -1;
    }
}
