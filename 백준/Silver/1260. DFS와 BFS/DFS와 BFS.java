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
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());

        graph = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            graph.put(i, new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int v1 = Integer.parseInt(st.nextToken());
            int v2 = Integer.parseInt(st.nextToken());
            graph.get(v1).add(v2);
            graph.get(v2).add(v1);
        }

        for (int i = 1; i <= n; i++) {
            Collections.sort(graph.get(i));
        }
        visited = new boolean[n + 1];
        dfs(start, sb);
        sb.append("\n");

        visited = new boolean[n + 1];
        bfs(start, sb);
        System.out.println(sb);
    }

    static void dfs(int start, StringBuilder sb) {
        Stack<Integer> stack = new Stack<>();
        stack.push(start);
        visited[start] = true;
        sb.append(start).append(" ");

        while (!stack.isEmpty()) {
            int v = stack.peek();
            boolean found = false;
            for (int next : graph.get(v)) {
                if (!visited[next]) {
                    visited[next] = true;
                    stack.push(next);
                    sb.append(next).append(" ");
                    found = true;
                    break;
                }
            }
            if (!found) {
                stack.pop();
            }
        }
    }

    static void bfs(int start, StringBuilder sb) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        visited[start] = true;
        sb.append(start).append(" ");

        while (!queue.isEmpty()) {
            int v = queue.poll();
            for (int next : graph.get(v)) {
                if (!visited[next]) {
                    visited[next] = true;
                    queue.offer(next);
                    sb.append(next).append(" ");
                }
            }
        }
    }
}