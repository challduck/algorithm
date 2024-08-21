import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            sb.append("String #" + (i + 1)).append("\n");
            for (int j = 0; j < str.length(); j++) {
                char ch = (char) (str.charAt(j) + 1);
                if (str.charAt(j) == 'Z') {
                    ch = 'A';
                }
                sb.append(ch);
                if (j == str.length() - 1) {
                    sb.append("\n");
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}