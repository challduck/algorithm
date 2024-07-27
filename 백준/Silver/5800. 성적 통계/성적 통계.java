
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= k; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            sb.append("Class " + i).append("\n");
            int[] arr = new int[n];

            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;

            for (int j = 0; j < n; j++) {
                int num = Integer.parseInt(st.nextToken());
                arr[j] = num;
                if (max < num) {
                    max = num;
                }
                if (min > num) {
                    min = num;
                }
            }

            Arrays.sort(arr);

            int largestGap = 0;

            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j + 1] - arr[j] > largestGap) {
                    largestGap = arr[j + 1] - arr[j];
                }
            }
            sb.append("Max " + max).append(", Min " + min).append(", Largest gap " + largestGap).append("\n");
        }
        System.out.println(sb.deleteCharAt(sb.length() - 1));
    }
}