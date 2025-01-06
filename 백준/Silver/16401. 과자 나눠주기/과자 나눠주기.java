import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] snacks = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            snacks[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max, snacks[i]);
        }

        Arrays.sort(snacks);

        System.out.println(binarySearch(snacks, max, m));
    }

    private static int binarySearch(int[] snacks, int max, int m) {
        int start = 1;
        int end = max;
        int answer = 0;

        while (start <= end) {
            int mid = (start + end) / 2;
            int cnt = 0;
            for (int i : snacks) {
                cnt += i / mid;
            }

            if (cnt >= m) {
                answer = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return answer;
    }
}