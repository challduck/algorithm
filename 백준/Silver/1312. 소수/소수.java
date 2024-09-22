import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        long temp = a % b;

        long digit = 0;
        for (int i = 0; i < n; i++) {
            temp *= 10;
            digit = temp / b;
            temp = temp % b;
        }
        System.out.println(digit);
    }
}
