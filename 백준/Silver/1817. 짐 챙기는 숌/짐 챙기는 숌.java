import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        if (n == 0) {
            System.out.println(0);
            return;
        }

        st = new StringTokenizer(br.readLine());
        int sum = 0;
        int bag = 0;
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(st.nextToken());

            if (sum + a > m) {
                bag++;
                sum = 0;
                sum += a;
            } else {
                sum += a;
            }

        }
        System.out.println(bag + 1);

    }
}
