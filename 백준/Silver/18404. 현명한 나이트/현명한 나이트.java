import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    
    // 나이트가 이동할 수 있는 8가지 방향
    static final int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
    static final int[] dy = {1, 2, 2, 1, -1, -2, -2, -1};
    static int startX, startY, n, m;
    static List<int[]> targets = new ArrayList<>();
    static int[][] graph;
    static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        
        graph = new int[n][n];
        st = new StringTokenizer(br.readLine());
        startX = Integer.parseInt(st.nextToken());
        startY = Integer.parseInt(st.nextToken());
        
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int endX = Integer.parseInt(st.nextToken());
            int endY = Integer.parseInt(st.nextToken());
            targets.add(new int[]{endX - 1, endY - 1});
        }
        bfs();
        System.out.println(sb);
    }

    static void bfs(){
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[n][n];
        queue.add(new int[]{startX - 1, startY - 1, 0});
        int[][] distance = new int[n][n];
        for (int[] row : distance) {
            Arrays.fill(row, -1);
        }
        distance[startX - 1][startY - 1] = 0;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            int dist = current[2];

            for (int i = 0; i < dx.length; i++) {
                int newX = x + dx[i];
                int newY = y + dy[i];

                if (newX >= 0 && newY >= 0 && newX < n && newY < n && !visited[newX][newY]) {
                    visited[newX][newY] = true;
                    distance[newX][newY] = dist + 1;
                    queue.add(new int[]{newX, newY, dist+1});
                }
            }
        }

        for (int[] end : targets) {
            sb.append(distance[end[0]][end[1]]).append(" ");
        }
    }
}
