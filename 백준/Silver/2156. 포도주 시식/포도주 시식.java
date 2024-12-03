import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] wines = new int[n];
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            int wine = Integer.parseInt(br.readLine());
            wines[i] = wine;
        }        
        
        if (n == 1) {
            System.out.println(wines[0]);
            return;
        } else if (n == 2) {
            System.out.println(wines[0] + wines[1]);
            return;
        }

        dp[0] = wines[0];
        dp[1] = wines[0] + wines[1];
        dp[2] = Math.max(Math.max(wines[0] + wines[1], wines[0] + wines[2]), wines[1] + wines[2]);
        for (int i = 3; i < n; i++) {
            dp[i] = Math.max(Math.max(dp[i - 1], dp[i - 2] + wines[i]), dp[i - 3] + wines[i - 1] + wines[i]);
        }

        System.out.println(dp[n - 1]);
    }
}
