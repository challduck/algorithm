import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        int sum = 0;

        for (int i = 0; i <= n; i++) {
            sum += (k * i) + (p * Math.pow(i, 2));
        }
        System.out.println(sum);
    }
}