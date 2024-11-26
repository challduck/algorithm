import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int n;
    static int m;
    static boolean[] visited;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        sb = new StringBuilder();
        visited = new boolean[n + 1];
        recur(0, "");
        System.out.print(sb.toString());
    }

    private static void recur(int depth, String output) {
        if (depth == n) {
            sb.append(output).append("\n");
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                recur(depth + 1, output + i + " ");
                visited[i] = false;
            }
        }
    }
}