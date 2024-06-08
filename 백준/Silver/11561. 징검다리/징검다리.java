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
            StringTokenizer st = new StringTokenizer(br.readLine());
            long n = Long.parseLong(st.nextToken());

            long start = 1;
            long end = (long) Math.sqrt(2 * n);
            long result = 0;

            while (start <= end) {
                long mid = (start + end) / 2;
                long sum = mid * (mid + 1) / 2;

                if (sum <= n) {
                    result = mid;
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            sb.append(result).append("\n");
        }
        System.out.println(sb.deleteCharAt(sb.length() - 1).toString());
    }
}