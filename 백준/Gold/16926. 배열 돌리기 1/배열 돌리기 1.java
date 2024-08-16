import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int layers = Math.min(n, m) / 2;

        for (int i = 0; i < layers; i++) {
            int rotation = 2 * ((n - 2 * i) + (m - 2 * i)) - 4;
            int effective_rotation = r % rotation;
            rotate(arr, n, m, i, effective_rotation);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sb.append(arr[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb.toString());
    }

    private static void rotate(int[][] arr, int n, int m, int layer, int r) {
        int start_row = layer;
        int start_col = layer;
        int end_row = n - 1 - layer;
        int end_col = m - 1 - layer;

        for (int rotation = 0; rotation < r; rotation++) {
            int temp = arr[start_row][start_col];

            for (int i = start_col; i < end_col; i++) {
                arr[start_row][i] = arr[start_row][i + 1];
            }
            for (int i = start_row; i < end_row; i++) {
                arr[i][end_col] = arr[i + 1][end_col];
            }
            for (int i = end_col; i > start_col; i--) {
                arr[end_row][i] = arr[end_row][i - 1];
            }
            for (int i = end_row; i > start_row + 1; i--) {
                arr[i][start_col] = arr[i - 1][start_col];
            }
            arr[start_row + 1][start_col] = temp;
        }
    }
}
