import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    /*
     * R = 0
     * G = 1
     * B = 2
     * 
     * R || G = 0
     * B = 1
     */
    static int n;
    static int[] dx = { 1, -1, 0, 0 };
    static int[] dy = { 0, 0, 1, -1 };
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        visited = new boolean[n][n];
        int[][] colorBlindGraph = new int[n][n];
        int[][] notColorBlindGraph = new int[n][n];

        int notColorBlindCnt = 0;
        int colorBlindCnt = 0;

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < n; j++) {
                char ch = str.charAt(j);
                if (ch == 'R') {
                    colorBlindGraph[i][j] = 0;
                    notColorBlindGraph[i][j] = 0;
                } else if (ch == 'G') {
                    colorBlindGraph[i][j] = 0;
                    notColorBlindGraph[i][j] = 1;

                } else if (ch == 'B') {
                    colorBlindGraph[i][j] = 1;
                    notColorBlindGraph[i][j] = 2;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j]) {
                    int findNum = colorBlindGraph[i][j];
                    bfs(i, j, findNum, colorBlindGraph);
                    colorBlindCnt++;
                }
            }
        }

        visited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j]) {
                    int findNum = notColorBlindGraph[i][j];
                    bfs(i, j, findNum, notColorBlindGraph);
                    notColorBlindCnt++;
                }
            }
        }
        System.out.println(notColorBlindCnt + " " + colorBlindCnt);
    }

    private static void bfs(int startX, int startY, int findNum, int[][] graph) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] { startX, startY });
        visited[startX][startY] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];

            for (int i = 0; i < dx.length; i++) {
                int newX = x + dx[i];
                int newY = y + dy[i];

                if (newX >= 0 && newY >= 0 && newX < n && newY < n && !visited[newX][newY]
                        && graph[newX][newY] == findNum) {
                    visited[newX][newY] = true;
                    queue.add(new int[] { newX, newY });
                }
            }
        }
    }
}