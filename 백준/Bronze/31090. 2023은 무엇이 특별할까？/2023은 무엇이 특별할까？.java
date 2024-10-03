import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            int mod = num % 100;
            if ((num + 1) % mod == 0) {
                sb.append("Good").append("\n");
            } else {
                sb.append("Bye").append("\n");
            }
        }
        System.out.println(sb);
    }
}