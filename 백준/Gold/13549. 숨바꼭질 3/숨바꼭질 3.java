import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int n, m;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        visited = new boolean[100001];

        bfs();

    }

    private static void bfs() {
        Deque<int[]> deque = new ArrayDeque<>();

        deque.addFirst(new int[] { n, 0 });
        visited[n] = true;

        while (!deque.isEmpty()) {
            int[] current = deque.poll();
            int position = current[0];
            int dist = current[1];

            if (position == m) {
                System.out.println(dist);
                return;
            }

            int teleport = position * 2;
            if (teleport > 0 && teleport <= 100000 && !visited[teleport]) {
                visited[teleport] = true;
                deque.addFirst(new int[] { teleport, dist });
            }

            int[] walks = { position - 1, position + 1 };
            for (int newPosition : walks) {
                if (newPosition >= 0 && newPosition <= 100000 && !visited[newPosition]) {
                    visited[newPosition] = true;
                    deque.addLast(new int[] { newPosition, dist + 1 });
                }
            }
        }
    }
}
