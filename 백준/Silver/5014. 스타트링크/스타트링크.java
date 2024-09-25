import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int f = Integer.parseInt(st.nextToken()); // 건물의 전체 층 수
        int s = Integer.parseInt(st.nextToken()); // 현재 층수
        int g = Integer.parseInt(st.nextToken()); // 목적지
        int u = Integer.parseInt(st.nextToken()); // 올라갈 수 있는 층 수
        int d = Integer.parseInt(st.nextToken()); // 내려갈 수 있는 층 수

        boolean[] visited = new boolean[f + 1];
        int[] movement = { u, -d };

        int num = bfs(visited, s, g, f, movement);

        if (num == -1) {
            System.out.println("use the stairs");
        } else {
            System.out.println(num);
        }
    }

    private static int bfs(boolean[] visited, int s, int g, int f, int[] movement) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] { s, 0 });
        visited[s] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int cur_floor = current[0];
            int dist = current[1];

            if (cur_floor == g) {
                return dist;
            }

            for (int i = 0; i < movement.length; i++) {
                int new_floor = cur_floor + movement[i];

                if (new_floor > 0 && new_floor <= f && !visited[new_floor]) {
                    visited[new_floor] = true;
                    queue.add(new int[] { new_floor, dist + 1 });
                }
            }
        }
        return -1;
    }
}