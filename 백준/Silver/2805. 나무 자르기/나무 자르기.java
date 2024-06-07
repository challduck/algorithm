import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        long m = Long.parseLong(st.nextToken());
        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        int max = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        long min_height = 0;
        long max_height = max;
        long res = 0;

        while (min_height <= max_height) {
            long mid = (min_height + max_height) / 2;
            long total = 0;
            for (int i : arr) {
                if (i > mid) {
                    total += i - mid;
                }
            }
            if (total >= m) {
                res = mid;
                min_height = mid + 1;
            } else {
                max_height = mid - 1;
            }
        }

        System.out.println(res);
    }

}