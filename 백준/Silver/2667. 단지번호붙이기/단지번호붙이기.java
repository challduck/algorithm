import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[] dx = { 1, -1, 0, 0 };
    static int[] dy = { 0, 0, 1, -1, };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] map = new int[n][n];
        boolean[][] visited = new boolean[n][n];
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < n; j++) {
                map[i][j] = str.charAt(j) - '0';
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 1 && !visited[i][j]) {
                    int num = bfs(map, visited, i, j, n);
                    list.add(num);
                }
            }
        }
        Collections.sort(list);
        StringBuilder sb = new StringBuilder();
        sb.append(list.size()).append("\n");
        for (Integer integer : list) {
            sb.append(integer).append("\n");
        }
        System.out.println(sb);
    }

    static int bfs(int[][] map, boolean[][] visited, int startX, int startY, int n) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] { startX, startY });
        int cnt = 0;
        boolean flag = false;
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            flag = true;

            for (int i = 0; i < dx.length; i++) {
                int newX = x + dx[i];
                int newY = y + dy[i];

                if (newX >= 0 && newY >= 0 && newX < n && newY < n && !visited[newX][newY] && map[newX][newY] == 1) {
                    cnt++;
                    visited[newX][newY] = true;
                    queue.add(new int[] { newX, newY });
                }
            }
        }
        if (flag && cnt == 0) {
            return 1;
        } else {
            return cnt;
        }
    }
}