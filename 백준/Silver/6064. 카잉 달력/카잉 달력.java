import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            if (x < 1 || x > m || y < 1 || y > n) {
                sb.append(-1).append("\n");
                continue;
            }

            int k = -1;

            for (int year = x; year <= m * n; year += m) {
                if ((year - x) % m == 0 && (year - y) % n == 0) {
                    k = year;
                    break;
                }
            }
            if (k == -1) {
                sb.append(-1).append("\n");
            } else {
                sb.append(k).append("\n");

            }
        }
        System.out.println(sb);
    }
}