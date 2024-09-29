import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        solved(0, 0, (1 << n), r, c);

    }

    private static void solved(int row, int col, int size, int r, int c) {
        if (size == 1) {
            System.out.println(count);
            return;
        }

        int half = size / 2;

        if (r < row + half && c < col + half) {
            solved(row, col, half, r, c);
        }
        else if (r < row + half && c >= col + half) {
            count += half * half;
            solved(row, col + half, half, r, c);
        }
        else if (r >= row + half && c < col + half) {
            count += half * half * 2;
            solved(row + half, col, half, r, c);
        }
        else {
            count += half * half * 3;
            solved(row + half, col + half, half, r, c);
        }
    }
}