import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
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
            sb.append(combination(m, n)).append("\n");
        }
        System.out.print(sb.toString());
    }

    private static int combination(int n, int r) {
        /*
         * n! / (n - r)!r!
         */

        return factorial(n).divide(factorial(n - r).multiply(factorial(r))).intValue();

    }

    private static BigInteger factorial(int n) {
        BigInteger num = BigInteger.valueOf(1);
        for (long i = 2; i <= n; i++) {
            num = num.multiply(BigInteger.valueOf(i));
        }
        return num;
    }
}