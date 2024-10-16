import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int sum = 0;
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
                sum += arr[j];
            }
            double average = (double) sum / n;
            int cnt = 0;
            for (int j = 0; j < arr.length; j++) {
                if (average < arr[j]) {
                    cnt++;
                }
            }
            sb.append(String.format("%.3f", (double) cnt / n * 100)).append("%\n");
        }
        System.out.print(sb);
    }
}