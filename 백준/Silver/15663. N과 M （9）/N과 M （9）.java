import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int n, m;
    static int[] arr;
    static boolean[] visited;
    static StringBuilder sb;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();
        arr = new int[n];
        visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        recur(0, new int[m]);
        System.out.print(sb);
    }

    private static void recur(int depth, int[] num_arr) {
        if (depth == m) {
            for (int i = 0; i < num_arr.length; i++) {
                sb.append(num_arr[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        int prevNum = -1;

        for (int i = 0; i < n; i++) {
            if (!visited[i] && arr[i] != prevNum) {
                visited[i] = true;
                num_arr[depth] = arr[i];
                recur(depth + 1, num_arr);
                visited[i] = false;
                prevNum = arr[i];
            }
        }
    }
}