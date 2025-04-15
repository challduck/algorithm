import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int answer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] L = new int[n];
        int[] J = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            L[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            J[i] = Integer.parseInt(st.nextToken());
        }

        recur(0, 100, 0, n, L, J);
        System.out.println(answer);
    }

    private static void recur(int depth, int health, int happy, int n, int[] L, int[] J) {
        if (depth == n) {
            if (health > 0) {
                answer = Math.max(answer, happy);
            }

            return;
        }
        // 인사를 하지 않고 지나가는 경우
        recur(depth + 1, health, happy, n, L, J);

        health -= L[depth];
        happy += J[depth];

        // 인사를 하는 경우
        if (health > 0) {
            recur(depth + 1, health, happy, n, L, J);
        }

    }
}