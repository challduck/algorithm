import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        long minSum = Long.MAX_VALUE;

        int x = 0, y = 0;
        int product = B / A;

        for (int i = 1; i <= Math.sqrt(product); i++) {
            if (product % i == 0) {
                int j = product / i;
                int a = A * i;
                int b = A * j;
                if (gcd(a, b) == A && lcm(a, b) == B) {
                    if (a + b < minSum) {
                        minSum = a + b;
                        x = a;
                        y = b;
                    }
                }
            }
        }
        if (x > y) {
            int temp = x;
            x = y;
            y = temp;
        }

        System.out.println(x + " " + y);
    }

    public static long lcm(int x, int y) {
        return (long) x * y / gcd(x, y);
    }

    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
