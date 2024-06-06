import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test_case = Integer.parseInt(br.readLine());
        for (int i = 0; i < test_case; i++) {
            int n = Integer.parseInt(br.readLine());
            Map<String, Integer> map = new HashMap<>();

            for (int j = 0; j < n; j++) {
                String[] str = br.readLine().split(" ");
                map.put(str[1], map.getOrDefault(str[1], 0) + 1);
            }

            int answer = 1;
            for (int cnt : map.values()) {
                answer *= (cnt + 1);
            }

            System.out.println(answer - 1);
        }
    }
}