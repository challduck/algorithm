import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());

            if (num == 0) {
                if (pq.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(pq.poll()).append("\n");
                }
            } else {
                for (int j = 0; j < num; j++) {
                    pq.add(Integer.parseInt(st.nextToken()));
                }
            }
        }
        System.out.println(sb);
    }
}