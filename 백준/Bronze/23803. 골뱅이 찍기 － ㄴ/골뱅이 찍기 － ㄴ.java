import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n * 5; i++) {
            if (i >= n * 4) {
                String str = "@".repeat(n * 5);
                sb.append(str).append("\n");
            } else {
                String str = "@".repeat(n);
                sb.append(str).append("\n");
            }
        }
        System.out.println(sb.deleteCharAt(sb.length() - 1).toString());
    }
}