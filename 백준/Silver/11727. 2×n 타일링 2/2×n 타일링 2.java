import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    /*
     * 1 = 1
     * 2 = 3
     * 3 = 1 1 1 , 2+2 1, 1 2+2 , 4 * 1, 1 * 4 => 5
     * 4 = 1 1 1 1, 1 1 2+2, 2+2 1 1, 1 2+2 1,
     */
    static int[] dp = new int[1001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        dp();
        System.out.println(dp[n]);
    }

    static void dp() {
        dp[1] = 1;
        dp[2] = 3;

        // i - 2 에서 *2를 하는 이유는 2x2 블럭이 존재하기 때문에 2x1 블럭 2개를 사용하는 경우와 동일하게 존재한다.
        for (int i = 3; i <= 1000; i++) {
            dp[i] = (dp[i - 1] + (dp[i - 2] * 2)) % 10007;
        }
    }

}