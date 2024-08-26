import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[k];

        int maxLen = Integer.MIN_VALUE;

        for (int i = 0; i < k; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            maxLen = Math.max(arr[i], maxLen);
        }

        System.out.println(binarySearch(arr, maxLen, n));
    }

    static long binarySearch(int[] arr, int maxLen, int target) {
        long start = 1;
        long end = maxLen;
        long res = 0;

        while (start <= end) {
            long mid = (start + end) / 2;
            long cnt = 0;
            for (int i : arr) {
                cnt += i / mid;
            }

            if (cnt >= target){
                res = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return res;
    }
}
