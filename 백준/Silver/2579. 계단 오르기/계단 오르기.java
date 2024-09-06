import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] step = new int[n];
        for (int i = 0; i < n; i++) {
            step[i] = Integer.parseInt(br.readLine());
        }

        int[] dp = new int[n + 1];

        if (n == 1) {
            System.out.println(step[0]);
            return;
        }

        dp[0] = step[0];
        dp[1] = step[0] + step[1];

        if (n > 2) {
            dp[2] = Math.max(step[1] + step[2], step[0] + step[2]);

            for (int i = 3; i < n; i++) {
                dp[i] = Math.max(dp[i - 3] + step[i - 1], dp[i - 2]) + step[i];
            }
        }

        System.out.println(dp[n - 1]);
    }
}