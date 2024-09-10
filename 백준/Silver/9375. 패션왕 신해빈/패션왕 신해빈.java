import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        for (int i = 0; i < t; i++) {
            Map<String , Integer> map = new HashMap<>();
            int n = Integer.parseInt(br.readLine());
            for (int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine());
                String val = st.nextToken();
                String key = st.nextToken();

                map.put(key, map.getOrDefault(key, 0) + 1);
            }

            int answer = 1;
            for (int cnt : map.values()) {
                answer *= (cnt + 1);
            }
            sb.append(answer - 1).append("\n");

        }

        System.out.println(sb);
    }
}
