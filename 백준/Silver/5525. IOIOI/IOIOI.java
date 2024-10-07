import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        String s = br.readLine();

        int cnt = 0;
        int patternCount = 0;

        for (int i = 1; i < m - 1; i++) {
            if (s.charAt(i - 1) == 'I' && s.charAt(i) == 'O' && s.charAt(i + 1) == 'I') {
                patternCount++;
                if (patternCount == n) {
                    cnt++;
                    patternCount--;
                }
                i++;
            } else {
                patternCount = 0;
            }
        }
        System.out.println(cnt);
    }
}