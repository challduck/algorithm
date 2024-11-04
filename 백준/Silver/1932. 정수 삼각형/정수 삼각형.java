import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][];
        int[][] dp = new int[n][];
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            arr[i] = new int[i + 1];
            dp[i] = new int[i + 1];
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j <= i; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        solution(n, arr, dp);
        int answer = 0;

        for (int i = 0; i < n; i++) {
            if (answer < dp[n-1][i]) {
                answer = dp[n-1][i];
            }
        }
        System.out.println(answer);
    }

    private static void solution(int n, int[][] arr, int[][] dp){
        dp[0][0] = arr[0][0];

        for (int i = 1; i < n; i++) {
            dp[i][0] = arr[i][0] + dp[i - 1][0];
            dp[i][i] = arr[i][i] + dp[i - 1][i - 1];
            for (int j = 1; j < i; j++) {
                dp[i][j] = arr[i][j] + Math.max(dp[i - 1][j - 1], dp[i - 1][j]);
            }
        }
    }
}
