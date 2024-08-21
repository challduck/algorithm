import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Queue<Integer> queue = new LinkedList<>();
        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        while (true) {
            if (queue.size() == 1) {
                sb.append(queue.poll());
                break;
            }

            sb.append(queue.poll()).append(" ");
            queue.add(queue.poll());
        }

        System.out.println(sb);
    }
}