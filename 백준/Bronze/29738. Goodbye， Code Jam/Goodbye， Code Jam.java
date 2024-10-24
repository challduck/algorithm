import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= t; i++) {
            int n = Integer.parseInt(br.readLine());
            sb.append("Case #").append(i).append(": ");
            if (n <= 25) {
                sb.append("World Finals");
            } else {
                sb.append("Round ");
                if (n <= 1000) {
                    sb.append(3);
                } else if (n <= 4500) {
                    sb.append(2);
                } else {
                    sb.append(1);
                }
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
