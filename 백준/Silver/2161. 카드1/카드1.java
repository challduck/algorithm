import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> queue = new LinkedList<>();

        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        StringBuilder sb = new StringBuilder();
        while (queue.size() != 0) {
            int num = queue.poll();
            sb.append(num + " ");
            if (!queue.isEmpty()) {
                int num2 = queue.poll();
                queue.offer(num2);
            }
        }
        System.out.println(sb);
    }
}