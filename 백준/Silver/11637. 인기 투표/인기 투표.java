import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int max = Integer.MIN_VALUE;
            int idx = 0;
            int sum = 0;
            int max_cnt = 0;
            Set<Integer> set = new HashSet<>();
            for (int j = 1; j <= n; j++) {
                int bote = Integer.parseInt(br.readLine());
                set.add(bote);
                sum += bote;
                if (max < bote) {
                    max = bote;
                    idx = j;
                    max_cnt = 1;
                } else if (max == bote) {
                    max_cnt++;
                }
            }

            if (set.size() == 1 || max_cnt > 1) {
                sb.append("no winner").append("\n");
            } else {
                if (sum < 2 * max) {
                    sb.append("majority winner ").append(idx).append("\n");
                } else {
                    sb.append("minority winner ").append(idx).append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}