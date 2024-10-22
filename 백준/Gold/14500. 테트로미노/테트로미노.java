import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int n, m;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[][] graph;

        int[][][] tetrominos = {
                { { 0, 0 }, { 0, 1 }, { 1, 0 }, { 1, 1 } }, // 1)
                { { 0, 0 }, { 0, 1 }, { 0, 2 }, { 0, 3 } }, // 2)
                { { 0, 0 }, { 1, 0 }, { 2, 0 }, { 3, 0 } }, // 3)
                { { 0, 0 }, { 0, 1 }, { 0, 2 }, { -1, 2 } }, // 4)
                { { 0, 0 }, { 1, 0 }, { 2, 0 }, { 2, 1 } }, // 5)
                { { 0, 0 }, { 1, 0 }, { 0, 1 }, { 0, 2 } }, // 6)
                { { 0, 0 }, { 0, 1 }, { 1, 1 }, { 2, 1 } }, // 7)
                { { 0, 0 }, { 0, 1 }, { -1, 1 }, { -1, 2 } }, // 8)
                { { 0, 0 }, { 1, 0 }, { 1, 1 }, { 2, 1 } }, // 9)
                { { 0, 0 }, { 0, 1 }, { 0, 2 }, { -1, 1 } }, // 10)
                { { 0, 0 }, { 1, 0 }, { 2, 0 }, { 1, 1 } }, // 11)
                { { 0, 0 }, { 0, 1 }, { 0, 2 }, { 1, 1 } }, // 12)
                { { 0, 0 }, { 0, 1 }, { -1, 1 }, { 1, 1 } }, // 13)
                { { 0, 0 }, { 0, 1 }, { 1, 1 }, { 1, 2 } }, // 14)
                { { 0, 0 }, { 1, 0 }, { 1, -1 }, { 2, -1 } }, // 15)
                { { 0, 0 }, { 1, 0 }, { 1, 1 }, { 1, 2 } }, // 16)
                { { 0, 0 }, { 0, 1 }, { 1, 0 }, { 2, 0 } }, // 17)
                { { 0, 0 }, { 0, 1 }, { 0, 2 }, { 1, 2 } }, // 18)
                { { 0, 0 }, { 1, 0 }, { 2, 0 }, { 2, -1 } } // 19)
        };
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        graph = new int[n][m];
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int[][] tetromino : tetrominos) {
                    max = Math.max(max, solved(graph, tetromino, i, j));
                }
            }
        }
        System.out.println(max);
    }

    private static int solved(int[][] graph, int[][] diagramCoord, int row, int col) {
        int sum = 0;

        for (int[] is : diagramCoord) {
            int newRow = row + is[0];
            int newCol = col + is[1];
            if (newRow < 0 || newRow >= n || newCol < 0 || newCol >= m) {
                return 0;
            }
            sum += graph[newRow][newCol];
        }

        return sum;
    }
}