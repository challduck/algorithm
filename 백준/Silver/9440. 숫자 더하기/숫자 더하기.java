import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            ;
            int n = Integer.parseInt(st.nextToken());
            if (n == 0) {
                break;
            }

            int[] num = new int[14];
            int zeroCount = 0;

            for (int i = 0; i < n; i++) {
                num[i] = Integer.parseInt(st.nextToken());
                if (num[i] == 0) {
                    zeroCount++;
                }
            }

            bubbleSort(num, n);

            for (int i = 0; i < 2; i++) {
                if (num[i] == 0) {
                    int temp = num[i];
                    num[i] = num[zeroCount + i];
                    num[zeroCount + i] = temp;
                }
            }

            int a = 0, b = 0;
            int index = n / 2 - 1;

            if (n % 2 == 0) {
                for (int i = 0; i < n; i++) {
                    if (i % 2 == 0) {
                        a += num[i] * Math.pow(10, index);
                    } else {
                        b += num[i] * Math.pow(10, index);
                        index--;
                    }
                }
            } else {
                for (int i = 0; i < n; i++) {
                    if (i % 2 == 0) {
                        a += num[i] * Math.pow(10, index + 1);
                    } else {
                        b += num[i] * Math.pow(10, index);
                        index--;
                    }
                }
            }

            sb.append(a + b).append("\n");
        }
        System.out.print(sb);
    }

    public static void bubbleSort(int[] arr, int num) {
        for (int i = num - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}