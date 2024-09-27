import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int max = 0;

        for (int i = 0; i < (1 << n); i++) {
            if (Integer.bitCount(i) != a) {
                continue;
            }

            for (int j = 0; j < (1 << n); j++) {
                if (Integer.bitCount(j) != b) {
                    continue;
                }

                int xor = i ^ j;
                max = Math.max(max, xor);
            }
        }
        System.out.println(max);
    }
}