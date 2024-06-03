import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int row_count = 0;
        int col_count = 0;
        int n = Integer.parseInt(br.readLine());
        char[][] room = new char[n][n];

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < n; j++) {
                room[i][j] = str.charAt(j);
            }
        }

        for (int i = 0; i < n; i++) {
            int empty = 0;
            for (int j = 0; j < n; j++) {
                if (room[i][j] == '.') {
                    empty++;
                } else {
                    if (empty>= 2) {
                        row_count++;
                    }
                    empty= 0;
                }
            }
            if (empty >= 2) {
                row_count++;
            }
        }

        for (int j = 0; j < n; j++) {
            int empty = 0;
                for (int i = 0; i < n; i++) {
                if (room[i][j] == '.') {
                    empty++;
                } else {
                    if (empty>= 2) {
                        col_count++;
                    }
                    empty= 0;
                }
            }
            if (empty >= 2) {
                col_count++;
            }
        }

        System.out.println(row_count + " " + col_count);
    }
    
}