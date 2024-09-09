import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    /*
     * n = 1
     * 1
     * 
     * n = 2
     * 1+1
     * 2
     * 
     * n = 3
     * 1+1+1
     * 1+2
     * 2+1
     * 3
     * 
     * n = 4
     * 1+1+1+1
     * 1+1+2
     * 1+2+1
     * 2+1+1
     * 2+2
     * 1+3
     * 3+1
     * 
     * 만약 idx n-1 n-2 n-3 의 합이라면, 5 = 13, 6 = 24 7 = 44
     * 찾음
     */
    static int[] dp = new int[12];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        dp();
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            sb.append(dp[n - 1]).append("\n");
        }
        System.out.println(sb);
    }

    static void dp() {
        dp[0] = 1;
        dp[1] = 2;
        dp[2] = 4;
        for (int i = 3; i < dp.length; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }
    }
}