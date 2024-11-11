import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] scores = new int[n][3];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            scores[i][0] = Integer.parseInt(st.nextToken());
            scores[i][1] = Integer.parseInt(st.nextToken());
            scores[i][2] = Integer.parseInt(st.nextToken());
        }

        int[][] max = new int[n][3];
        int[][] min = new int[n][3];

        max[0][0] = scores[0][0];
        max[0][1] = scores[0][1];
        max[0][2] = scores[0][2];

        min[0][0] = scores[0][0];
        min[0][1] = scores[0][1];
        min[0][2] = scores[0][2];

        for (int i = 1; i < n; i++) {
            max[i][0] = scores[i][0] + Math.max(max[i - 1][0], max[i - 1][1]);
            max[i][1] = scores[i][1] + Math.max(Math.max(max[i - 1][0], max[i - 1][1]), max[i - 1][2]);
            max[i][2] = scores[i][2] + Math.max(max[i - 1][1], max[i - 1][2]);

            min[i][0] = scores[i][0] + Math.min(min[i - 1][0], min[i - 1][1]);
            min[i][1] = scores[i][1] + Math.min(Math.min(min[i - 1][0], min[i - 1][1]), min[i - 1][2]);
            min[i][2] = scores[i][2] + Math.min(min[i - 1][1], min[i - 1][2]);
        }
        int maxScore = Math.max(Math.max(max[n - 1][0], max[n - 1][1]), max[n - 1][2]);
        int minScore = Math.min(Math.min(min[n - 1][0], min[n - 1][1]), min[n - 1][2]);

        System.out.println(maxScore + " " + minScore);
    }
}
