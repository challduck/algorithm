import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int L = 1;
        while (L <= N) {
            L *= 2;
        }
        L /= 2;

        int result = 2 * (N - L);
        if (result == 0) {
            result = L;
        }

        System.out.println(result);
    }
}