import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            if (n == 0 && m == 0) {
                break;
            }

            Set<Integer> set = new HashSet<>();

            for (int i = 0; i < n; i++) {
                set.add(Integer.parseInt(br.readLine()));
            }

            int cnt = 0;

            for (int i = 0; i < m; i++) {
                if (set.contains(Integer.parseInt(br.readLine()))) {
                    cnt++;
                }
            }

            sb.append(cnt).append("\n");
        }

        System.out.print(sb.toString());
    }
}