import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int cnt = 666;
        int idx = 0;

        while (idx < n) {
            String str = Integer.toString(cnt);
            int sixCount = 0;

            for (int i = 0; i < str.length() - 2; i++) {
                if (str.charAt(i) == '6' && str.charAt(i + 1) == '6' && str.charAt(i + 2) == '6') {
                    sixCount++;
                    i += 2;
                }
            }
            if (sixCount >= 1) {
                idx++;
            }
            cnt++;
        }
        System.out.println(cnt - 1);
    }
}