import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            pq.add(Integer.parseInt(st.nextToken()));
        }

        int time = 0;

        while (!pq.isEmpty()) {
            int first = pq.poll();
            int second = pq.isEmpty() ? 0 : pq.poll();

            if (first > 0) {
                time++;
                first--;
            }
            if (second > 0) {
                second--;
            }

            if (first > 0) {
                pq.add(first);
            }
            if (second > 0) {
                pq.add(second);
            }
        }

        if (time > 1440) {
            System.out.println(-1);
        } else {
            System.out.println(time);
        }
    }
}