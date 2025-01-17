import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        int sum = 0;
        int max = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            sum += arr[i];
            max = Math.max(max, arr[i]);
        }

        System.out.println(binarySearch(max, sum, arr, m));
    }

    private static int binarySearch(int max, int sum, int[] arr, int m) {
        int left = max;
        int right = sum;

        while (left < right) {
            int mid = (left + right) / 2;
            int temp = 0;
            int cnt = 1;

            for (int i : arr) {
                if (temp + i > mid) {
                    cnt++;
                    temp = i;
                    if (cnt > m) {
                        break;
                    }
                } else {
                    temp += i;
                }
            }

            if (cnt > m) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }
}
