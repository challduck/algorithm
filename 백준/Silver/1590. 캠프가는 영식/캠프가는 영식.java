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
            int start = Integer.parseInt(st.nextToken());
            int Interval = Integer.parseInt(st.nextToken());
            int count = Integer.parseInt(st.nextToken());

            if (start == t) {
                System.out.println(0);
                return;
            }

            if (start + (Interval * count) < t) {
                continue;
            }

            int[] bus = new int[count];

            for (int j = 0; j < count; j++) {
                bus[j] = start + (Interval * j);
            }

            int time = binarySearch(bus, t);
            if (time != -1) {
                flag = true;
                answer = Math.min(answer, time);
            }
        }
        System.out.println(flag ? answer : -1);
    }

    private static int binarySearch(int[] arr, int t) {
        int left = 0;
        int right = arr.length - 1;

        int res = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] >= t) {
                res = arr[mid];
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return res == -1 ? -1 : res - t;
    }
}