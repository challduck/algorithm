import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int c = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(br.readLine());
        int[][] board = new int[r][c];

        if (k > c * r) {
            System.out.println(0);
            return;
        }

        int row = r - 1;
        int column = 0;
        int cnt = 1;
        int direction = 0;

        while (cnt != k + 1) {
            board[row][column] = cnt;

            if (cnt == k) break;

            int newR = row + dx[direction];
            int newC = column + dy[direction];

            if (newC < 0 || newR < 0 || newC >= c || newR >= r || board[newR][newC] != 0) {
                direction = (direction + 1) % 4;
                newR = row + dx[direction];
                newC = column + dy[direction];
            }
            row = newR;
            column = newC;
            cnt++;
        }

        System.out.println((column + 1) + " " + (r - row));
    }
}
