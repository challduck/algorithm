import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            graph.put(i, new ArrayList<>());
        }

        StringTokenizer st;
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int v1 = Integer.parseInt(st.nextToken());
            int v2 = Integer.parseInt(st.nextToken());
            graph.get(v1).add(v2);
            graph.get(v2).add(v1);
        }

        System.out.println(bfs(n, 1, graph));
    }

    static int bfs(int n, int start, Map<Integer, List<Integer>> graph) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        boolean[] visited = new boolean[n + 1];

        int cnt = -1;

        while (!queue.isEmpty()) {
            int current = queue.poll();
            if (!visited[current]) {
                visited[current] = true;
                cnt++;
                for (Integer i : graph.get(current)) {
                    if (!visited[i]) {
                        queue.add(i);
                    }
                }
            }
        }
        return cnt;
    }
}