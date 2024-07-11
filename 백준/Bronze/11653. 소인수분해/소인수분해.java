import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        int a = 2;
        while (true) {
            if (n == 1 || n == 0) {
                break;
            }
            if (n % a == 0) {
                n /= a;
                sb.append(a).append("\n");

            } else {
                a++;
            }
        }
        System.out.println(sb);
    }
}