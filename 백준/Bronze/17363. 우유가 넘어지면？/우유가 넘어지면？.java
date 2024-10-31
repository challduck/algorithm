import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        char[][] arr = new char[n][m];
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < m; j++) {
                char ch = str.charAt(j);
                if (ch == '.') {
                    arr[i][j] = '.';
                } else if (ch == 'O') {
                    arr[i][j] = 'O';
                } else if (ch == '-') {
                    arr[i][j] = '|';
                } else if (ch == '|') {
                    arr[i][j] = '-';
                } else if (ch == '/') {
                    arr[i][j] = '\\';
                } else if (ch == '\\') {
                    arr[i][j] = '/';
                } else if (ch == '^') {
                    arr[i][j] = '<';
                } else if (ch == '<') {
                    arr[i][j] = 'v';
                } else if (ch == 'v') {
                    arr[i][j] = '>';
                } else if (ch == '>') {
                    arr[i][j] = '^';
                }
            }
        }

        for (int i = m - 1; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                sb.append(arr[j][i]);
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
