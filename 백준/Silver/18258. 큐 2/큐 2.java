import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        LinkedList<Integer> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            if (command.equals("push")) {
                queue.add(Integer.parseInt(st.nextToken()));
            } else if (command.equals("pop")) {
                if (!queue.isEmpty()) {
                    sb.append(queue.pollFirst()).append("\n");
                } else {
                    sb.append(-1).append("\n");
                }
            } else if (command.equals("size")) {
                sb.append(queue.size()).append("\n");
            } else if (command.equals("empty")) {
                if (!queue.isEmpty()) {
                    sb.append(0).append("\n");
                } else {
                    sb.append(1).append("\n");
                }
            } else if (command.equals("front")) {
                if (!queue.isEmpty()) {
                    sb.append(queue.peekFirst()).append("\n");
                } else {
                    sb.append(-1).append("\n");
                }
            } else if (command.equals("back")) {
                if (!queue.isEmpty()) {
                    sb.append(queue.peekLast()).append("\n");
                } else {
                    sb.append(-1).append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}
