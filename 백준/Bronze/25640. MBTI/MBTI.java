import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String Jinho_MBTI = br.readLine();
        Set<String> set = new HashSet<>();
        set.add(Jinho_MBTI);
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            String MBTI = br.readLine();
            if (set.contains(MBTI)) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}