import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int[] lan_cable = new int[k];
        int max_cable = 0;
        for (int i = 0; i < k; i++) {
            int cable = Integer.parseInt(br.readLine());
            lan_cable[i] = cable;
            max_cable = Math.max(max_cable, cable);
        }
        
        long start = 1;
        long end = max_cable;
        long result = 0;
        while (start <= end) {
            long mid = (start + end) / 2;
            long cnt = 0;

            for (int i : lan_cable) {
                cnt += i / mid;
            }

            if (cnt >= n) {
                result = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.println(result);
    }
}