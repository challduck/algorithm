import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int j2 = 0; j2 < n; j2++) {
                    if (i + j + j2 == n && i >= j + 2 && i != 0 && j != 0 && j2 != 0 && j2 % 2 == 0) {
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}