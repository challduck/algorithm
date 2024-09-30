import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(st.nextToken());
            arr[i] = a;
        }

        System.out.println(fruitCount(n, arr));
    }

    private static int fruitCount(int n, int[] arr) {
        int left = 0;
        int max = 0;
        int[] fruitCountArr = new int[10];

        for (int i = 0; i < n; i++) {
            fruitCountArr[arr[i]] += 1;
            while (fruitTypeCount(fruitCountArr) > 2) {
                fruitCountArr[arr[left]]--;
                left++;
            }
            max = Math.max(max, i - left + 1);
        }
        return max;
    }

    private static int fruitTypeCount(int[] fruit_count_arr) {
        int cnt = 0;
        for (int i = 1; i < fruit_count_arr.length; i++) {
            if (fruit_count_arr[i] > 0) {
                cnt++;
            }
        }
        return cnt;
    }
}