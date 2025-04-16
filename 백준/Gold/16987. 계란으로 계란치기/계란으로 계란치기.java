import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static int[][] eggs;
    static int answer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        eggs = new int[n][2];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            eggs[i][0] = Integer.parseInt(st.nextToken());
            eggs[i][1] = Integer.parseInt(st.nextToken());
        }

        recur(0);

        System.out.println(answer);
    }

    static void recur(int depth) {
        if (depth == n) {
            // 모든 계란을 순회하고 난 후 계산산
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                if (eggs[i][0] <= 0) {
                    cnt++;
                }
            }
            answer = Math.max(answer, cnt);
            return;
        }

        // 현재 계란이 깨졌다면 다음 계란으로로
        if (eggs[depth][0] <= 0) {
            recur(depth + 1);
            return;
        }

        boolean flag = false;
        for (int i = 0; i < n; i++) {
            if (i == depth || eggs[i][0] <= 0)
                continue;

            flag = true;

            // 계란끼리 충돌
            eggs[depth][0] -= eggs[i][1];
            eggs[i][0] -= eggs[depth][1];

            recur(depth + 1); // 다음 계란으로 이동동

            // 원상 복구구
            eggs[depth][0] += eggs[i][1];
            eggs[i][0] += eggs[depth][1];
        }

        // 더이상 깰 계란이 없다면 다음으로 넘어가야한다.
        if (!flag) {
            recur(depth + 1);
        }
    }
}