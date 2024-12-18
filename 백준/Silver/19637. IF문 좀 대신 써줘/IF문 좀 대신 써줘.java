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
        StringBuilder sb = new StringBuilder();

        String[] titles = new String[n];
        int[] powerLimits = new int[n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            titles[i] = st.nextToken();
            powerLimits[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < m; i++) {
            int characterPower = Integer.parseInt(br.readLine());
            sb.append(binarySearch(titles, powerLimits, characterPower)).append("\n");
        }

        System.out.print(sb.toString());
    }

    private static String binarySearch(String[] titles, int[] powerLimits, int target) {
        int left = 0;
        int right = powerLimits.length - 1;
        int idx = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (powerLimits[mid] >= target) {
                idx = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return titles[idx];
    }
}