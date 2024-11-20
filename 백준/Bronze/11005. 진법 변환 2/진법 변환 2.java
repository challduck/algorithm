import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        System.out.println(solution(n, b));
    }

    private static String solution(int n, int b) {
        StringBuilder sb = new StringBuilder();
        if (n == 0) {
            return "0";
        }
        while (n > 0) {
            if (n % b < 10) {
                sb.append(n % b);
            } else {
                sb.append((char) (n % b - 10 + 'A'));
            }
            n /= b;
        }

        return sb.reverse().toString();
    }
}
