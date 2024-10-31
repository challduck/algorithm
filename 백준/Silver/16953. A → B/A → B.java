import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        System.out.println(bfs(a, b));
    }

    private static long bfs(int start, long end) {
        Queue<long[]> queue = new LinkedList<>();
        queue.add(new long[] { start, 1 });
        while (!queue.isEmpty()) {
            long[] current = queue.poll();
            long current_num = current[0];
            long dist = current[1];

            if (current_num == end) {
                return dist;
            }

            long num1 = current_num * 2;
            if (num1 <= end) {
                queue.add(new long[] { num1, dist + 1 });
            }
            long num2 = current_num * 10 + 1;
            if (num2 <= end) {
                queue.add(new long[] { num2, dist + 1 });
            }
        }
        return -1;
    }
}
