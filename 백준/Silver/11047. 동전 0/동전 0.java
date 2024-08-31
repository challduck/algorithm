import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(br.readLine());
            arr[i] = a;
        }
        int cnt = 0;
        int idx = arr.length - 1;
        while (true) {
            if (k == 0) {
                break;
            }

            if (k / arr[idx] == 0) {
                idx--;
            }
            cnt += k / arr[idx];
            k %= arr[idx];
        }
        System.out.println(cnt);
    }
}