import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        String target = "I" + "OI".repeat(n);
        String s = br.readLine();
        int cnt = 0;

        for (int i = 0; i < m; i++) {
            boolean flag = true;
            for (int j = 0; j < target.length(); j++) {
                if (i + j < m && target.charAt(j) == s.charAt(i + j)) {
                    continue;
                } else {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}