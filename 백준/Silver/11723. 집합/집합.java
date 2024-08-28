import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        Set<Integer> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            if (command.equals("add")) {
                set.add(Integer.parseInt(st.nextToken()));
            } else if (command.equals("remove")) {
                set.remove(Integer.parseInt(st.nextToken()));
            } else if (command.equals("check")) {
                if (set.contains(Integer.parseInt(st.nextToken()))) {
                    sb.append(1).append("\n");
                } else {
                    sb.append(0).append("\n");
                }
            } else if (command.equals("toggle")) {
                int num = Integer.parseInt(st.nextToken());
                if (set.contains(num)) {
                    set.remove(num);
                } else {
                    set.add(num);
                }
            } else if (command.equals("all")) {
                for (int j = 1; j <= 20; j++) {
                    set.add(j);
                }
            } else if (command.equals("empty")) {
                set.clear();
            }
        }
        System.out.println(sb);
    }
}