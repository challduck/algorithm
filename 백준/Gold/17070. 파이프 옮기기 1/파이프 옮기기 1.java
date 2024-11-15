import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int n;
    static int[][] graph;
    static int[][][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        graph = new int[n][n];
        dp = new int[n][n][3];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dp[0][1][0] = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (graph[i][j] == 1) {
                    continue;
                }
                // 가로
                if (j + 1 < n && graph[i][j + 1] == 0) {
                    dp[i][j + 1][0] += dp[i][j][0];
                    dp[i][j + 1][0] += dp[i][j][2];
                }
                // 세로
                if (i + 1 < n && graph[i + 1][j] == 0) {
                    dp[i + 1][j][1] += dp[i][j][1];
                    dp[i + 1][j][1] += dp[i][j][2];
                }
                // 대각선
                if (i + 1 < n && j + 1 < n && graph[i + 1][j] == 0 && graph[i][j + 1] == 0
                        && graph[i + 1][j + 1] == 0) {
                    dp[i + 1][j + 1][2] += dp[i][j][0];
                    dp[i + 1][j + 1][2] += dp[i][j][1];
                    dp[i + 1][j + 1][2] += dp[i][j][2];
                }
            }
        }

        int answer = dp[n - 1][n - 1][0] + dp[n - 1][n - 1][1] + dp[n - 1][n - 1][2];
        System.out.println(answer);
    }
}