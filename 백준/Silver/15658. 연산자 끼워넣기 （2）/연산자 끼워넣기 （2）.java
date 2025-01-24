import java.io.*;
import java.util.*;

public class Main {
    static int max, min;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] operators = new int[4];
        max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            operators[i] = Integer.parseInt(st.nextToken());
        }

        solution(arr[0], 1, n, arr, operators);

        System.out.println(max);
        System.out.println(min);
    }

    private static void solution(int current, int idx, int n, int[] arr, int[] operators) {
        if (idx == n) {
            max = Math.max(max, current);
            min = Math.min(min, current);
            return;
        }

        for (int i = 0; i < 4; i++) {
            if (operators[i] > 0) {
                operators[i]--;
                int newValue;

                switch (i) {
                    case 0:
                        newValue = current + arr[idx];
                        break;
                    case 1:
                        newValue = current - arr[idx];
                        break;
                    case 2:
                        newValue = current * arr[idx];
                        break;
                    case 3:
                        newValue = current < 0 ? -(-current / arr[idx]) : current / arr[idx];
                        break;
                    default:
                        newValue = 0;
                }

                solution(newValue, idx + 1, n, arr, operators);
                operators[i]++;
            }
        }
    }
}
