import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        char d = st.nextToken().charAt(0);

        int cnt = 0;

        for (int i = 1; i <= n; i++) {
            String str = String.valueOf(i);

            for (char c : str.toCharArray()) {
                if (c == d) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);

    }
}