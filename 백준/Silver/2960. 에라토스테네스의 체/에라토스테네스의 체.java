import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        System.out.println(prime(n, k));
    }

    private static int prime(int start, int num) {
        boolean[] isPrime = new boolean[start + 1];

        for (int i = 2; i <= start; i++) {
            isPrime[i] = true;
        }
        int cnt = 0;
        int a = 0;
        for (int i = 2; i <= start; i++) {
            if (isPrime[i]) {
                for (int j = i; j <= start; j += i) {
                    if (isPrime[j]) {
                        isPrime[j] = false;
                        cnt++;
                        if (cnt == num) {
                            a = j;
                            break;
                        }
                    }
                }
            }
            if (cnt == num) {
                break;
            }
        }
        return a;
    }
}