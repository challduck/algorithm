import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        long start = 0;
        long end = 0;
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(st.nextToken());
            arr[i] = a;
            end = Math.max(end, a);
        }
        System.out.println(binarySearch(m, arr, start, end));
    }

    private static long binarySearch(int m, int[] arr, long start, long end) {
        long answer = 0;

        while (start <= end) {
            long mid = (start + end) / 2;
            long temp = 0;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > mid) {
                    temp += arr[i] - mid;
                }
            }

            if (temp >= m) {
                answer = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return answer;
    }
}