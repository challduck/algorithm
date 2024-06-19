import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][n];
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (a == 1 && b == 3 || a == 3 && b == 1) {
                cnt++;
            } else if (a == 3 && b == 4 || a == 4 && b == 3) {
                cnt++;
            } else if (a == 1 && b == 4 || a == 4 && b == 1) {
                cnt++;
            } else {
                cnt--;
            }
        }

        if (cnt == 3) {
            System.out.println("Wa-pa-pa-pa-pa-pa-pow!");
        } else {
            System.out.println("Woof-meow-tweet-squeek");
        }
    }
}