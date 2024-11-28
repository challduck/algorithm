import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            sb.append(combination(m, n)).append("\n");
        }
        System.out.print(sb.toString());
    }

    private static int combination(int n, int r) {
        if (r == n) {
            return 1;
        }

        int[][] dp = new int[n + 1][r + 1];

        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1;
            dp[i][Math.min(r, i)] = 1;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= Math.min(i, r); j++) {
                dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
            }
        }

        return dp[n][r];
    }
}