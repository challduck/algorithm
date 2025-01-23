import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[m];

        int max = 0;
        for (int i = 0; i < m; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            max = Math.max(max, arr[i]);
        }

        System.out.println(binarySearch(arr, n, max));
    }

    private static int binarySearch(int[] arr, int n, int max) {
        int start = 1;
        int end = max;

        while (start < end) {
            int mid = (start + end) / 2;

            int sum = 0;
            for (int i : arr) {
                sum += (i + mid - 1) / mid;
                if (sum > n) {
                    break;
                }
            }

            if (sum > n) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return start;
    }
}
