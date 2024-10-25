import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int n;
    static int m;
    static StringBuilder sb;
    static int[] num_arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        num_arr = new int[n];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            num_arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(num_arr);
        recur(0, new int[m], new boolean[n]);
        System.out.print(sb);
    }

    private static void recur(int depth, int[] arr, boolean[] visited) {
        if (depth == m) {
            for (int i = 0; i < arr.length; i++) {
                sb.append(arr[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 0; i < n; i++) {
            if (visited[i])
                continue;

            arr[depth] = num_arr[i];
            visited[i] = true;
            recur(depth + 1, arr, visited);
            visited[i] = false;
        }
    }
}
