import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int n, m, s, e;
    static Map<Integer, List<Integer>> graph;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        s = Integer.parseInt(st.nextToken());
        e = Integer.parseInt(st.nextToken());
        visited = new boolean[n + 1];
        graph = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            graph.put(i, new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph.get(x).add(y);
            graph.get(y).add(x);
        }

        bfs();
    }

    private static void bfs() {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] { s, 0 });
        visited[s] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int cur_position = current[0];
            int dist = current[1];

            if (cur_position == e) {
                System.out.println(dist);
                return;
            }

            for (int i : graph.get(cur_position)) {
                if (!visited[i]) {
                    visited[i] = true;
                    queue.add(new int[] { i, dist + 1 });
                }
            }

            if (cur_position + 1 <= n && !visited[cur_position + 1]) {
                visited[cur_position + 1] = true;
                queue.add(new int[] { cur_position + 1, dist + 1 });
            }
            if (cur_position - 1 > 0 && !visited[cur_position - 1]) {
                visited[cur_position - 1] = true;
                queue.add(new int[] { cur_position - 1, dist + 1 });
            }
        }
    }
}