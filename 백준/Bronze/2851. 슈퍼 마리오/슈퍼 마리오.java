import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < 10; i++) {
            int n = Integer.parseInt(br.readLine());
            if (sum1 + n <= 100) {
                sum1 += n;
                sum2 += n;
            } else {
                sum2 += n;
                break;
            }
        }

        if (Math.abs(100 - sum1) < Math.abs(100 - sum2)) {
            System.out.println(sum1);
        } else {
            System.out.println(sum2);
        }

    }
}