import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private static final int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
    private static final int[] dy = {1, 2, 2, 1, -1, -2, -2, -1};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        while (n-- > 0) {
            int l = scanner.nextInt();
            int startX = scanner.nextInt();
            int startY = scanner.nextInt();
            int endX = scanner.nextInt();
            int endY = scanner.nextInt();

            System.out.println(bfs(l, startX, startY, endX, endY));
        }

        scanner.close();
    }

    private static int bfs(int l, int start_x, int start_y, int end_x, int end_y) {
        if (start_x == end_x && start_y == end_y) {
            return 0;
        }

        boolean[][] visited = new boolean[l][l];
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{start_x, start_y, 0});
        visited[start_x][start_y] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            int moves = current[2];
            for (int i = 0; i < 8; i++) {
                int new_x = x + dx[i];
                int new_y = y + dy[i];

                if (new_x >= 0 && new_x < l && new_y >= 0 && new_y < l && !visited[new_x][new_y]) {
                    if (new_x == end_x && new_y == end_y) {
                        return moves + 1;
                    }
                    queue.offer(new int[]{new_x, new_y, moves + 1});
                    visited[new_x][new_y] = true;
                }
            }
        }

        return -1;
    }
}
