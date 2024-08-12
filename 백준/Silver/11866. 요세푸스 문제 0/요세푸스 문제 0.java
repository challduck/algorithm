import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        sb.append("<");
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        while (true) {
            if (queue.size() == 1) {
                sb.append(queue.poll()).append(">");
                break;
            }

            for (int i = 1; i <= k; i++) {
                if (i == k) {
                    sb.append(queue.poll()).append(", ");
                } else {
                    int a = queue.poll();
                    queue.add(a);
                }
            }
        }
        System.out.println(sb);
    }
}