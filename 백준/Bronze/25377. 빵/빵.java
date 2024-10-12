import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int minTime = Integer.MAX_VALUE;
        boolean flag = false;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if (a <= b) {
                flag = true;
                minTime = Math.min(minTime, b);
            }
        }

        if (flag) {
            System.out.println(minTime);
        } else {
            System.out.println(-1);
        }
    }
}