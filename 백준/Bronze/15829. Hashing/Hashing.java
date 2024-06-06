import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        BigInteger sum = new BigInteger("0");
        BigInteger square = new BigInteger("1");
        for (int i = 0; i < n; i++) {
            sum = sum.add(BigInteger.valueOf(str.charAt(i) - 'a' + 1).multiply(square));
            square = square.multiply(BigInteger.valueOf(31));
        }
        System.out.println(sum.mod(BigInteger.valueOf(1234567891)));
    }
}