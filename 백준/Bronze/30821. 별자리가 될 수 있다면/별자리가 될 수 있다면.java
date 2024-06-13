import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int r = 5;
        BigInteger result = calc(n, r);
        System.out.println(result);
    }

    public static BigInteger factorial(int n) {
        BigInteger fact = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }

    public static BigInteger calc(int n, int r) {
        if (r < 0 || r > n) {
            return BigInteger.ZERO;
        }
        BigInteger numerator = factorial(n);
        BigInteger denominator = factorial(r).multiply(factorial(n - r));
        return numerator.divide(denominator);
    }
}
