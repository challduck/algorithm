import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        BigInteger[] bi = new BigInteger[n + 1];
        bi[0] = BigInteger.valueOf(0);
        bi[1] = BigInteger.valueOf(1);
        for (int i = 2; i <= n; i++) {
            bi[i] = bi[i - 2].add(bi[i - 1]);
        }
        System.out.println(bi[n]);
    }
}