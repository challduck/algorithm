import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Integer.parseInt(br.readLine());
        BigInteger sum = new BigInteger("0");

        if ((n - 1) % 2 == 0) {
            sum = sum.add(BigInteger.valueOf((long) (n * ((n - 1) / 2))));
        } else {
            sum = sum.add(BigInteger.valueOf((long) n * ((n - 1) / 2) + ((n - 1) - ((n - 1) / 2))));
        }

        StringTokenizer st = new StringTokenizer(br.readLine());
        BigInteger bigInteger = new BigInteger("0");

        for (int i = 0; i < n; i++) {
            bigInteger = bigInteger.add(BigInteger.valueOf(Long.parseLong(st.nextToken())));
        }
        System.out.println((int) Math.abs(bigInteger.subtract(sum).intValue()));

    }
}