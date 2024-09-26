import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int[][] map = new int[n][m];

        int min_height = Integer.MAX_VALUE;
        int max_height = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                int num = Integer.parseInt(st.nextToken());
                min_height = Math.min(min_height, num);
                max_height = Math.max(max_height, num);
                map[i][j] = num;
            }
        }

        int min_time = Integer.MAX_VALUE;
        int best_height = 0;

        for (int i = min_height; i <= max_height; i++) {
            int time = 0;
            int used_block = 0;

            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    int current_height = map[j][k];
                    if (current_height < i) {
                        used_block += (i - current_height);
                        time += (i - current_height);
                    } else if (current_height > i) {
                        used_block -= (current_height - i);
                        time += (current_height - i) * 2;
                    }
                }
            }

            if (used_block <= b) {
                if (time < min_time) {
                    min_time = time;
                    best_height = i;
                } else if (time == min_time && i > best_height) {
                    best_height = i;
                }
            }
        }

        System.out.println(min_time + " " + best_height);
    }
}