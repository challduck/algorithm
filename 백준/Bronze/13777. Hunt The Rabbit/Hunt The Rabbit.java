import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) {
                System.out.println(sb);
                break;
            }
            int start = 1;
            int end = 50;
            while (true) {
                int mid = (start + end) / 2;
                sb.append(mid).append(" ");
                if (mid == n) {
                    sb.append("\n");
                    break;
                } else if (mid > n) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
    }
}