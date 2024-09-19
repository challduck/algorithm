import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 전체 칸 수
        int s = Integer.parseInt(st.nextToken()); // 출발 지점
        int d = Integer.parseInt(st.nextToken()); // 도착 지점
        int f = Integer.parseInt(st.nextToken()); // 전진 칸
        int b = Integer.parseInt(st.nextToken()); // 후진 칸
        int k = Integer.parseInt(st.nextToken()); // 경찰서 수

        Map<Integer, Integer> graph = new HashMap<>();
        boolean[] visited = new boolean[n + 1];
        int[] movement = { f, -b };
        if (k != 0) {
            st = new StringTokenizer(br.readLine());
        }


        for (int i = 0; i < k; i++) {
            int police_office_location = Integer.parseInt(st.nextToken());
            graph.put(police_office_location, -1);
        }

        for (int i = 1; i <= n; i++) {
            if (!graph.containsKey(i)) {
                graph.put(i, 0);
            }
        }
        int num = bfs(graph, visited, s, d, n, movement);

        if (num == -1) {
            System.out.println("BUG FOUND");
        } else {
            System.out.println(num);
        }
    }

    static int bfs(Map<Integer, Integer> graph, boolean[] visited, int start, int end, int n, int[] movement) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] { start, 0 });
        visited[start] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int cur_location = current[0];
            int dist = current[1];
            
            if (cur_location == end) {
                return dist;
            }

            for (int i = 0; i < movement.length; i++) {
                int new_location = cur_location + movement[i];

                if (new_location > 0 && new_location <= n && !visited[new_location] && graph.getOrDefault(new_location, 0) != -1) {
                    visited[new_location] = true;
                    queue.add(new int[] { new_location, dist + 1 });
                }
            }
        }

        return -1;
    }
}