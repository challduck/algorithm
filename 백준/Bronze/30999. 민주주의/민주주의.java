import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            int temp = 0;
            String str = br.readLine();
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == 'O') {
                    temp++;
                }
            }
            if (m / 2 < temp) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
