import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        int[] dp = new int[n + 1];

        for (int i = 0; i < n; i++) {
            dp[i + 1] = Math.max(dp[i], dp[i + 1]);
            if (i + arr[i][0] <= n) {
                dp[i + arr[i][0]] = Math.max(dp[i + arr[i][0]], dp[i] + arr[i][1]);
            }
        }
        int answer = Integer.MIN_VALUE;
        for (int i = 0; i < dp.length; i++) {
            answer = Math.max(answer, dp[i]);
        }
        System.out.println(answer);
    }
}