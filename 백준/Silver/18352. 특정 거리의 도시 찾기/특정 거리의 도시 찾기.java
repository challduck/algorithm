import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int point_a = Integer.parseInt(st.nextToken());
            int point_b = Integer.parseInt(st.nextToken());
            graph.get(point_a).add(point_b);
        }
        int[] length = new int[N + 1];
        Arrays.fill(length, -1);
        length[X] = 0;

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(X);
        StringBuilder sb = new StringBuilder();
        while (!queue.isEmpty()) {
            int current = queue.poll();

            for (int next : graph.get(current)) {
                if (length[next] == -1) {
                    length[next] = length[current] + 1;
                    queue.offer(next);
                }
            }

        }

        List<Integer> answer = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            if (length[i] == K) {
                answer.add(i);
            }
        }

        if (answer.isEmpty()) {
            sb.append(-1).append("\n");
        } else {
            Collections.sort(answer);
            for (int i : answer) {
                sb.append(i).append("\n");
            }
        }
        System.out.println(sb.deleteCharAt(sb.length() - 1).toString());
    }
}
