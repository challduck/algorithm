import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> queue = new LinkedList<>();
        int n = Integer.parseInt(br.readLine());

        while (true) {
            int num = Integer.parseInt(br.readLine());
            if (num == -1) {
                break;
            }

            if (num == 0) {
                queue.poll();
            } else if (queue.size() == n) {
                continue;
            } else {
                queue.add(num);
            }
        }

        StringBuilder sb = new StringBuilder();
        if (queue.isEmpty()) {
            System.out.println("empty");
        } else {
            while (!queue.isEmpty()) {
                sb.append(queue.poll()).append(" ");
            }
            System.out.println(sb);
        }
    }
}