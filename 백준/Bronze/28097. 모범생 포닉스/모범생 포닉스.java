import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sum = (n - 1) * 8;
        for (int i = 0; i < n; i++) {
            sum += Integer.parseInt(st.nextToken());
        }

        System.out.println(sum / 24 + " " + sum % 24);
    }
}