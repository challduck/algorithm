import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        double a = 0;
        for (int i = 0; i < n; i++) {
            a = (1 - (1 - (a / 100)) * (1 - (Integer.parseInt(st.nextToken()) / 100.0))) * 100;
            sb.append(a).append("\n");
        }
        System.out.println(sb);
    }
}