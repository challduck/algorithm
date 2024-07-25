import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n + 1][m + 1];
        int[][] sum = new int[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                sum[i][j] = arr[i][j] + sum[i - 1][j] + sum[i][j - 1] - sum[i - 1][j - 1];
            }
        }

        int k = Integer.parseInt(br.readLine());

        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            int idx_i = Integer.parseInt(st.nextToken());
            int idx_j = Integer.parseInt(st.nextToken());
            int idx_x = Integer.parseInt(st.nextToken());
            int idx_y = Integer.parseInt(st.nextToken());

            int result = sum[idx_x][idx_y]
                    - sum[idx_i - 1][idx_y]
                    - sum[idx_x][idx_j - 1]
                    + sum[idx_i - 1][idx_j - 1];
            sb.append(result).append("\n");
        }

        System.out.println(sb);
    }
}
