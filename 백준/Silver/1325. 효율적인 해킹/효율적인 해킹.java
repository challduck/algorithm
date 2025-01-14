import java.io.*;
import java.util.*;

public class Main {
    static int[] cnts;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);

        List<Integer>[] graph = new ArrayList[n + 1];
        for (int i = 0; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            String[] data = br.readLine().split(" ");
            int u = Integer.parseInt(data[0]);
            int v = Integer.parseInt(data[1]);
            graph[v].add(u);
        }

        cnts = new int[n + 1];
        int max = 0;

        for (int i = 1; i <= n; i++) {
            bfs(i, graph, n);
            max = Math.max(max, cnts[i]);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            if (cnts[i] == max) {
                sb.append(i).append(" ");
            }
        }
        System.out.println(sb);
    }

    private static void bfs(int start, List<Integer>[] graph, int n) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        boolean[] visited = new boolean[n + 1];
        visited[start] = true;

        while (!queue.isEmpty()) {
            int current = queue.poll();

            for (int next : graph[current]) {
                if (!visited[next]) {
                    cnts[start]++;
                    visited[next] = true;
                    queue.offer(next);
                }
            }
        }

    }
}
