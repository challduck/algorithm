import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BigInteger K = new BigInteger(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        List<Integer> list = primeList(L);
        for(int prime : list){
            if (K.mod(BigInteger.valueOf(prime)).equals(BigInteger.ZERO)) {
                System.out.println("BAD " + prime);
                return;
            }
        }
        System.out.println("GOOD");
    }

    private static List<Integer> primeList(int l) {
        boolean[] isPrime = new boolean[l + 1];

        for (int i = 2; i < l; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i < l; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < l; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 2; i < l; i++) {
            if (isPrime[i]) {
                list.add(i);
            }
        }

        return list;
    }
}