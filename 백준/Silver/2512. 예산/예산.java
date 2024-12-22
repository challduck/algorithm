import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        int high = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            high = Math.max(high, arr[i]);
        }
        int m = Integer.parseInt(br.readLine());

        System.out.println(binarySearch(arr, m, high));
    }

    private static int binarySearch(int[] arr, int t, int high) {
        int left = 0;
        int right = high;
        int res = 0;

        while (left <= right) {
            int mid = (left + right) / 2;

            boolean flag = false;
            long sum = 0;

            for (int i : arr) {
                if (i > mid) {
                    sum += mid;
                } else {
                    sum += i;
                }

                if (sum > t) {
                    flag = false;
                    break;
                }
            }

            if (sum <= t) {
                flag = true;
            }

            if (flag) {
                res = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return res;
    }
}