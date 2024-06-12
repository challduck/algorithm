import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int d = Integer.parseInt(br.readLine());
            int cnt = (int) Math.sqrt(d);

            while (true) {
                if (cnt + (cnt * cnt) > d) {
                    cnt--;
                } else if (cnt + (cnt * cnt) <= d) {
                    sb.append(cnt).append("\n");
                    break;
                }
            }
        }
        System.out.println(sb.deleteCharAt(sb.length() - 1).toString());
    }
}