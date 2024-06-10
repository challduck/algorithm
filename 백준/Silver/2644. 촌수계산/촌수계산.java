import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int start = sc.nextInt();
        int end = sc.nextInt();
        int m = sc.nextInt();

        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            graph.put(i, new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int parent = sc.nextInt();
            int child = sc.nextInt();
            graph.get(parent).add(child);
            graph.get(child).add(parent);
        }
        System.out.println(bfs(graph, start, end, n));
    }

    private static int bfs(Map<Integer, List<Integer>> graph, int start, int end, int n) {
        boolean[] visited = new boolean[n + 1];
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{start, 0});
        visited[start] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int cur_node = current[0];
            int cur_depth = current[1];

            if (cur_node == end) {
                return cur_depth;
            }

            for (int neighbor : graph.get(cur_node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(new int[]{neighbor , cur_depth + 1});
                }
            }
        }

        return -1;
    }
    
}
