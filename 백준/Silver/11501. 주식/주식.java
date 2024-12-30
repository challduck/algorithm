import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] stocks = new int[n];
            for (int j = 0; j < n; j++) {
                int stockPrice = Integer.parseInt(st.nextToken());
                stocks[j] = stockPrice;
            }

            long answer = 0;
            int maxStock = 0;

            for (int j = n - 1; j >= 0; j--) {
                if (stocks[j] > maxStock) {
                    maxStock = stocks[j];
                } else {
                    answer += maxStock - stocks[j];
                }
            }

            sb.append(answer).append("\n");
        }

        System.out.print(sb);
    }
}