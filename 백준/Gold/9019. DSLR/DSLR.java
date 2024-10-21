import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static boolean[] visited = new boolean[10001];
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            Arrays.fill(visited, false);
            bfs(a, b);
        }
        System.out.print(sb.toString());
    }

    private static void bfs(int start, int target) {
        Queue<CommandLine> queue = new LinkedList<>();
        queue.add(new CommandLine(start, ""));
        visited[start] = true;

        while (!queue.isEmpty()) {
            CommandLine current = queue.poll();
            int num = current.num;
            String command = current.command;

            if (num == target) {
                sb.append(command).append("\n");
                return;
            }

            int[] DSLR = new int[4];
            DSLR[0] = (num * 2) % 10000;
            DSLR[1] = num == 0 ? 9999 : num - 1;
            DSLR[2] = (num % 1000) * 10 + (num / 1000);
            DSLR[3] = (num % 10) * 1000 + (num / 10);

            char[] commands = { 'D', 'S', 'L', 'R' };

            for (int i = 0; i < 4; i++) {
                if (!visited[DSLR[i]]) {
                    queue.add(new CommandLine(DSLR[i], command + commands[i]));
                    visited[DSLR[i]] = true;
                }
            }

        }
    }

    static class CommandLine {
        int num;
        String command;

        CommandLine(int num, String command) {
            this.num = num;
            this.command = command;
        }
    }
}
