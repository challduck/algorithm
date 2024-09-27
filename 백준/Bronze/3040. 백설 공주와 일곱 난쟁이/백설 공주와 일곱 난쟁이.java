import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[9];
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            int num = Integer.parseInt(br.readLine());
            arr[i] = num;
            sum += num;
        }
        int fake1 = 0;
        int fake2 = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    int temp = arr[i] + arr[j];
                    if (sum - temp == 100) {
                        fake1 = arr[i];
                        fake2 = arr[j];
                    }
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != fake1 && arr[i] != fake2) {
                System.out.println(arr[i]);
            }
        }
        // 7 ? => 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 - 가짜1 - 가짜 2 == 100;
        // 2 =>
    }
}