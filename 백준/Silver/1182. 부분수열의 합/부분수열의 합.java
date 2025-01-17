import java.io.*;
import java.util.*;

public class Main {
    static int cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        solution(0, 0, arr, n, s);

        if (s == 0)
            cnt--;
        System.out.println(cnt);
    }

    private static void solution(int i, int j, int[] arr, int n, int s) {
        if (i == n) {
            if (j == s) {
                cnt++;
            }
            return;
        }

        solution(i + 1, j + arr[i], arr, n, s);
        solution(i + 1, j, arr, n, s);
    }
}
