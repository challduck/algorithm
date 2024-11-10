import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            sb.append(factorial(n).divide(factorial(n - m).multiply(factorial(m)))).append("\n");
        }
        System.out.print(sb);
    }

    private static BigInteger factorial(int n){
        BigInteger num = new BigInteger("1");
        for (int i = 2; i <= n; i++) {
            num = num.multiply(new BigInteger(Integer.toString(i)));
        }
        return num;
    }
}
