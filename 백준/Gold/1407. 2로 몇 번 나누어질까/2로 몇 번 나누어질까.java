import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        A -= 1;
        long tmp_A = A;
        for (int i = 1; i < 99; i++) {
            long divisor = 1L << i;
            if (divisor > Long.MAX_VALUE || A / divisor == 0) {
                break;
            }
            tmp_A += (A / divisor) * ((divisor) - (divisor >> 1));
        }

        long tmp_B = B;

        for (int i = 1; i < 99; i++) {
            long divisor = 1L << i;
            if (divisor > Long.MAX_VALUE || B / divisor == 0) {
                break;
            }
            tmp_B += (B / divisor) * ((divisor) - (divisor >> 1));
        }

        System.out.println(tmp_B - tmp_A);
    }

}