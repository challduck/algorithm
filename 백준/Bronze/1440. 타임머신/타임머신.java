import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), ":");
        String num1 = st.nextToken();
        String num2 = st.nextToken();
        String num3 = st.nextToken();

        List<String[]> list = Arrays.asList(
                new String[] {num1, num2, num3},
                new String[] {num1, num3, num2},
                new String[] {num2, num3, num1},
                new String[] {num2, num1, num3},
                new String[] {num3, num1, num2},
                new String[] {num3, num2, num1}
        );

        int cnt = 0;
        for (String[] s : list) {
            if (isHour(s[0]) && isMMorSS(s[1]) && isMMorSS(s[2])){
                cnt++;
            }
        }
        System.out.println(cnt);
    }

    private static boolean isMMorSS(String s) {
        int val = Integer.parseInt(s);
        return val >= 0 && val <= 59;
    }

    private static boolean isHour(String s) {
        int val = Integer.parseInt(s);
        return val >= 1 && val <= 12;
    }
}