import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int n, m;
    static int[][] city;
    static List<int[]> houses = new ArrayList<>();
    static List<int[]> chickens = new ArrayList<>();
    static int answer = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        city = new int[n][n];

        for (int r = 0; r < n; r++) {
            st = new StringTokenizer(br.readLine());
            for (int c = 0; c < n; c++) {
                city[r][c] = Integer.parseInt(st.nextToken());
                if (city[r][c] == 1) {
                    houses.add(new int[] { r, c });
                } else if (city[r][c] == 2) {
                    chickens.add(new int[] { r, c });
                }
            }
        }

        solution(0, 0, new int[m][2]);

        System.out.println(answer);
    }

    private static void solution(int start, int cnt, int[][] arr) {
        if (cnt == m) {
            int total = 0;
            for (int[] house : houses) {
                int min = Integer.MAX_VALUE;
                for (int[] chicken : arr) {
                    int dist = Math.abs(house[0] - chicken[0]) + Math.abs(house[1] - chicken[1]);
                    min = Math.min(min, dist);
                }
                total += min;
            }
            answer = Math.min(answer, total);
            return;
        }

        for (int i = start; i < chickens.size(); i++) {
            arr[cnt] = chickens.get(i);
            solution(i + 1, cnt + 1, arr);
        }
    }
}