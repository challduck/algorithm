import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int n, m;
    static int[] arr;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        recur(0, new int[m], new boolean[n]);
        System.out.print(sb);
    }

    private static void recur(int depth, int[] num_arr, boolean[] visited) {
        if (depth == m) {
            for (int i = 0; i < num_arr.length; i++) {
                sb.append(num_arr[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                continue;
            }
            num_arr[depth] = arr[i];
            if (depth >= 1 && num_arr[depth - 1] >= num_arr[depth]) {
                continue;
            }
            visited[i] = true;
            recur(depth + 1, num_arr, visited);
            visited[i] = false;
        }
    }
}