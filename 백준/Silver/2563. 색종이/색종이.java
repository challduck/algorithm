import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int color_paper = Integer.parseInt(br.readLine());

        int[][] white_paper = new int[100][100];

        for (int[] is : white_paper) {
            Arrays.fill(is, 0);
        }

        for (int i = 0; i < color_paper; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++) {
                    white_paper[j][k] = 1;
                }
            }
        }
        int cnt = 0;
        for (int[] is : white_paper) {
            for (int num : is) {
                if (num == 1) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);

    }
}
