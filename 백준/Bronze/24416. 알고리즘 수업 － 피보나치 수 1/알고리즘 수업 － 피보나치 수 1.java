import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.*;

public class Main {

    public static int fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return (fib(n - 1)) + fib(n - 2);
        }
    }

    public static int fibonacci(int n) {
        int[] f = new int[n + 1];
        f[1] = 1;
        f[2] = 1;
        int cnt = 0;
        for (int i = 3; i <= n; i++) {
            f[i] = f[i - 1] + f[i - 2];
            cnt++;
        }

        return cnt;
    }

    public static void main(String args[]) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        System.out.println(fib(n));
        System.out.println(fibonacci(n));

    }
}
