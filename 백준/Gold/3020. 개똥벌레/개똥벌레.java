import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int[] arr = new int[h + 1];

        for (int i = 0; i < n; i++) {
            int line = Integer.parseInt(br.readLine());
            if (i % 2 == 0) {
                arr[0]++;
                //
                arr[line]--;
            } else {
                arr[h - line]++;
            }
        }

        int[] prefix = new int[h + 1];

        for (int i = 0; i < h; i++) {
            prefix[i + 1] = prefix[i] + arr[i];
        }

        int min = Integer.MAX_VALUE;
        int cnt = 0;

        for (int i = 1; i <= h; i++) {
            if (prefix[i] < min) {
                min = prefix[i];
                cnt = 1;
            } else if (prefix[i] == min) {
                cnt++;
            }
        }

        System.out.println(min + " " + cnt);
    }
}
