import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            if (command.equals("push_front")) {
                deque.addFirst(Integer.parseInt(st.nextToken()));
            } else if (command.equals("push_back")) {
                deque.addLast(Integer.parseInt(st.nextToken()));
            } else if (command.equals("pop_front")) {
                int empty = deque.isEmpty() ? -1 : deque.pollFirst();
                sb.append(empty).append("\n");
            } else if (command.equals("pop_back")) {
                int empty = deque.isEmpty() ? -1 : deque.pollLast();
                sb.append(empty).append("\n");
            } else if (command.equals("size")) {
                sb.append(deque.size()).append("\n");
            } else if (command.equals("empty")) {
                sb.append(deque.isEmpty() ? 1 : 0).append("\n");
            } else if (command.equals("front")) {
                int empty = deque.isEmpty() ? -1 : deque.peekFirst();
                sb.append(empty).append("\n");
            } else if (command.equals("back")) {
                int empty = deque.isEmpty() ? -1 : deque.peekLast();
                sb.append(empty).append("\n");
            }
        }

        System.out.println(sb);
    }
}