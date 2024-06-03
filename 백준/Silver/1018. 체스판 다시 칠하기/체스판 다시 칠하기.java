import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] sizes = br.readLine().split(" ");
        int n = Integer.parseInt(sizes[0]);
        int m = Integer.parseInt(sizes[1]);

        char[][] chess_board = new char[n][m];
        for (int i = 0; i < n; i++) {
            String row = br.readLine();
            for (int j = 0; j < m; j++) {
                chess_board[i][j] = row.charAt(j);
            }
        }
        int value = Integer.MAX_VALUE;
        for (int i = 0; i <= n - 8; i++) {
            for (int j = 0; j <= m - 8; j++) {
                value = Math.min(value, calc(chess_board, i, j));
            }
        }
        
        System.out.println(value);
    }
    
    private static int calc(char[][] board, int x, int y) {
        int white = 0;
        int black = 0;
        
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                char current = board[x + i][y + j];
                if ((i + j) % 2 == 0) {
                    if (current != 'W') white++;
                } else {
                    if (current != 'B') white++;
                }
                if ((i + j) % 2 == 0) {
                    if (current != 'B') black++;
                } else {
                    if (current != 'W') black++;
                }
            }
        }
        return Math.min(white, black);
    }
}
