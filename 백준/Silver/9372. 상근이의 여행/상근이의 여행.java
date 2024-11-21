import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int n, m;
    static Map<Integer, List<Integer>> graph;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            visited = new boolean[n + 1];
            graph = new HashMap<>();

            for (int j = 1; j <= n; j++) {
                graph.put(j, new ArrayList<>());
            }

            for (int j = 0; j < m; j++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());

                graph.get(a).add(b);
                graph.get(b).add(a);
            }

            sb.append(bfs()).append("\n");
        }
        System.out.print(sb.toString());
    }

    private static int bfs() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        visited[1] = true;

        int cnt = 0;
        while (!queue.isEmpty()) {
            int current = queue.poll();

            for (int i : graph.get(current)) {
                if (!visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                    cnt++;
                }
            }
        }
        return cnt;
    }
}