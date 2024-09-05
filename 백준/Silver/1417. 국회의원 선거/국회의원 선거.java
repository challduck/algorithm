import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        int dasom = Integer.parseInt(br.readLine());

        for (int i = 0; i < n - 1; i++) {
            pq.add(Integer.parseInt(br.readLine()));
        }

        int cnt = 0;
        while (!pq.isEmpty() && pq.peek() >= dasom) {
            int max = pq.poll();
            max--;
            dasom++;
            cnt++;
            pq.add(max);
        }
        System.out.println(cnt);
    }
}