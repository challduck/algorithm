import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String[] keys = new String[n];
        for (int i = 0; i < n; i++) {
            keys[i] = br.readLine();
        }
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < m; i++) {
            String str = br.readLine();
            map.put(str, map.getOrDefault(str, 0) + 1);
        }

        int cnt = 0;
        for (String string : keys) {
            if (map.containsKey(string)) {
                cnt += map.get(string);
            }
        }
        System.out.println(cnt);
    }
}