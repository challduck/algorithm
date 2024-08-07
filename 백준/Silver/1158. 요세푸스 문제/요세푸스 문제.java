import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        System.out.println(josephus(N, K));
    }

    private static String josephus(int n, int k) {
        Queue<Integer> queue = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }
        while (true){
            if (queue.size() == 1){
                sb.append(queue.poll());
                break;
            }

            for (int i = 1; i <= k; i++) {
                if (i == k){
                    sb.append(queue.poll()).append(", ");
                } else {
                    int a = queue.poll();
                    queue.add(a);
                }
            }
        }

        sb.append(">");
        return sb.toString();
    }
}