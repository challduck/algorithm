import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int white = 0;
    static int blue = 0;
    static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                String str = st.nextToken();
                if (str.equals("1")) {
                    arr[i][j] = 1;
                }
            }
        }
        solved(0, 0, n);
        System.out.println(white);
        System.out.println(blue);
    }

    private static void solved(int x, int y, int num) {
        if (num == 1) {
            if (arr[x][y] == 1) {
                blue++;
            } else {
                white++;
            }
            return;
        }

        boolean flag = true;
        int cur_color = arr[x][y];

        for (int i = x; i < x + num; i++) {
            for (int j = y; j < y + num; j++) {
                if (arr[i][j] != cur_color) {
                    flag = false;
                    break;
                }
            }
            if (!flag) {
                break;
            }
        }

        if (flag) {
            if (cur_color == 1) {
                blue++;
            } else {
                white++;
            }
        } else {
            int n = num / 2;
            solved(x, y, n);
            solved(x, y + n, n);
            solved(x + n, y, n);
            solved(x + n, y + n, n);
        }
    }

}
