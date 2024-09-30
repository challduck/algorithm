import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static Map<Integer, List<Integer>> graph;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        graph = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            graph.put(i, new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        int answer = 0;
        int prev = Integer.MAX_VALUE;

        visited = new boolean[n + 1];

        for (int i = 1; i <= n; i++) {
            int num = bfs(i, n);
            if (prev > num) {
                prev = num;
                answer = i;
            } else if (prev == num) {
                answer = Math.min(answer, i);
            }
        }
        System.out.println(answer);
    }

    private static int bfs(int start, int n) {
        int sum = 0;
        Queue<int[]> queue = new LinkedList<>();
        int[] dist = new int[n + 1];

        Arrays.fill(visited, false);
        Arrays.fill(dist, -1);

        queue.add(new int[] { start, 0 });
        visited[start] = true;
        dist[start] = 0;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int cur_num = current[0];
            int cur_dist = current[1];

            for (int j : graph.get(cur_num)) {
                if (!visited[j]) {
                    visited[j] = true;
                    dist[j] = cur_dist + 1;
                    queue.add(new int[] { j, dist[j] });
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            if (i != start && dist[i] != -1) {
                sum += dist[i];
            }
        }

        return sum;
    }
}