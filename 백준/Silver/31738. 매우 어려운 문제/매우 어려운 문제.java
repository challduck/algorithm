import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long n = Long.parseLong(st.nextToken());
        long m = Long.parseLong(st.nextToken());

        System.out.println(factorial_mod(n, m));
    }

    public static long factorial_mod(long n, long m){
        if (n >= m){
            return 0;
        }

        long result = 1;

        for (int i = 2; i <= n; i++) {
            result = (result * i) % m;
            if (result == 0) break;
        }

        return result;
    }
}