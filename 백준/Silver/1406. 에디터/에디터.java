import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        StringBuilder sb = new StringBuilder().append(str);

        int n = Integer.parseInt(br.readLine());
        int cursor = sb.length();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s1 = st.nextToken();
            if (s1.equals("L")) {
                if (cursor > 0) {
                    cursor--;
                }
            } else if (s1.equals("D")) {
                if (cursor < sb.length()) {
                    cursor++;
                }
            } else if (s1.equals("B")) {
                if (cursor > 0) {
                    cursor--;
                    sb.deleteCharAt(cursor);
                }
            } else if (s1.equals("P")) {
                String s2 = st.nextToken();
                sb.insert(cursor, s2);
                cursor++;
            }
        }

        System.out.println(sb);
    }
}
