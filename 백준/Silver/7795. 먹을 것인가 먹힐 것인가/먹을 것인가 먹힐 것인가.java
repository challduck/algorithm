import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            int[] groupA = new int[n];
            int[] groupB = new int[m];
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                groupA[j] = Integer.parseInt(st.nextToken());
            }
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                groupB[j] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(groupB);

            int count = 0;
            for (int a : groupA) {
                count += binarySearch(groupB, a);
            }

            sb.append(count).append("\n");

        }
        System.out.print(sb.toString());
    }

    private static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }
}