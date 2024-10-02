import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        boolean[] visited = new boolean[100001];

        System.out.println(bfs(n, k, visited));
    }

    private static int bfs(int n, int k, boolean[] visited) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] { n, 0 });
        visited[n] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int cur_num = current[0];
            int dist = current[1];

            if (cur_num == k) {
                return dist;
            }

            int[] next_location = { current[0] - 1, current[0] + 1, current[0] * 2 };

            for (int i : next_location) {
                if (i >= 0 && i <= 100000 && !visited[i]) {
                    queue.add(new int[] { i, current[1] + 1 });
                    visited[i] = true;
                }
            }
        }
        return -1;
    }
}