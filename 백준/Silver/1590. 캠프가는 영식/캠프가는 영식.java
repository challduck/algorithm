import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());
        int answer = Integer.MAX_VALUE;
        boolean flag = false;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int I = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (t == s) {
                System.out.println(0);
                System.exit(0);
            }
            int waiting = binarySearch(s, I, c, t);
            if (waiting != -1) {
                flag = true;
                answer = Math.min(answer, waiting);
            }
        }
        System.out.println(flag ? answer : -1);
    }

    private static int binarySearch(int s, int i, int c, int t) {
        int left = 0;
        int right = c - 1;

        int res = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int busTime = s + (mid * i);

            if (busTime >= t) {
                res = busTime;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return res == -1 ? -1 : res - t;
    }
}
