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
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            int[][] apartment = new int[k + 1][15];
            
            for (int j = 1; j <= 14; j++) {
                apartment[0][j] = j;
            }

            for (int j = 1; j <= k; j++) {
                for (int l = 1; l < 15; l++) {
                    apartment[j][l] = apartment[j - 1][l] + apartment[j][l - 1];
                }
            }
            sb.append(apartment[k][n]).append("\n");
        }
        System.out.println(sb);
    }
}