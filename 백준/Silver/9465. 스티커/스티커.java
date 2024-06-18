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
            int n = Integer.parseInt(br.readLine());
            int[][] arr = new int[2][n + 1];

            for (int j = 0; j < 2; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int k = 1; k <= n; k++) {
                    arr[j][k] = Integer.parseInt(st.nextToken());
                }
            }

            if (n == 1){
                sb.append(Math.max(arr[0][1],arr[1][1])).append("\n");
                continue;
            }

            int[][] max_sticker = new int[2][n + 1];
            max_sticker[0][1] = arr[0][1];
            max_sticker[1][1] = arr[1][1];

            for (int j = 2; j <= n; j++) {
                max_sticker[0][j] = Math.max(max_sticker[1][j - 1], max_sticker[1][j - 2]) + arr[0][j];
                max_sticker[1][j] = Math.max(max_sticker[0][j - 1], max_sticker[0][j - 2]) + arr[1][j];
            }
            int res = Math.max(max_sticker[0][n], max_sticker[1][n]);
            sb.append(res).append("\n");
        }
        System.out.println(sb);

    }
}