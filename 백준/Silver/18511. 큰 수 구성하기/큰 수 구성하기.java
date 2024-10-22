import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int n;
    static int k;
    static int[] arr;
    static long answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        arr = new int[k];
        st = new StringTokenizer(br.readLine());
        answer = Integer.MIN_VALUE;

        for (int i = 0; i < k; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        recur(0, "");
        System.out.println(answer);
    }

    private static void recur(int depth, String str) {
        if (depth > 0) {
            long a = Long.parseLong(str);
            if (a <= n) {
                answer = Math.max(answer, a);
            } else {
                return;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            recur(depth + 1, str + arr[i]);
        }
    }
}
