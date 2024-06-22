import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        int card = 0;
        while (true) {

            if (queue.size() == 1) {
                card = queue.poll();
                break;
            } else {
                queue.poll();
                if (queue.size() == 1) {
                    card = queue.poll();
                    break;
                } else {
                    queue.add(queue.poll());
                }
            }
        }
        System.out.println(card);

    }
}