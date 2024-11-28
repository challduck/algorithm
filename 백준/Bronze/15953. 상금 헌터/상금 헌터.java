import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int[] firstFestival = { 5000000, 3000000, 2000000, 500000, 300000, 100000 };
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int prizeMoney = 0;
            if (a != 0 && a < 22) {
                int rank = 0;
                int prize = 0;
                for (int j = 1; j <= 6; j++) {
                    rank += j;
                    prize = firstFestival[j - 1];
                    if (a <= rank) {
                        prizeMoney += prize;
                        break;
                    }
                }
            }
            if (b != 0 && b < 32) {
                int rank = 0;
                int prize = 5120000;
                for (int j = 1; j <= 16; j *= 2) {
                    rank += j;
                    if (b <= rank) {
                        prizeMoney += prize;
                        break;
                    }
                    prize /= 2;
                }
            }
            sb.append(prizeMoney).append("\n");
        }
        System.out.print(sb.toString());
    }
}