import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()){
                StringBuilder ss = new StringBuilder();
                String str = st.nextToken();
                for (int j = str.length(); j > 0; j--) {
                    ss.append(str.charAt(j - 1));
                }
                sb.append(ss).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
