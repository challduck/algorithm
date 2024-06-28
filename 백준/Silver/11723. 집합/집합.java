import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        Set<Integer> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            if (command.equals("add")) {
                set.add(Integer.parseInt(st.nextToken()));
            } else if (command.equals("remove")) {
                int target = Integer.parseInt(st.nextToken());
                if (set.contains(target)) {
                    set.remove(target);
                } else {
                    continue;
                }
            } else if (command.equals("check")) {
                int target = Integer.parseInt(st.nextToken());
                if (set.contains(target)) {
                    sb.append(1).append("\n");
                } else {
                    sb.append(0).append("\n");
                }
            } else if (command.equals("toggle")) {
                int target = Integer.parseInt(st.nextToken());
                if (set.contains(target)) {
                    set.remove(target);
                } else {
                    set.add(target);
                }
            } else if (command.equals("all")) {
                for (int j = 1; j <= 20; j++) {
                    set.add(j);
                }
            } else if (command.equals("empty")) {
                set.clear();
            }
        }
        if (sb.length() != 0) {
            System.out.println(sb.deleteCharAt(sb.length() - 1));
        }
    }
}