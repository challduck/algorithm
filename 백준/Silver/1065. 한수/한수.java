import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (i <= 99) {
                answer++;
            } else {
                int target = i;
                int a = target / 100;
                target %= 100;
                int b = target / 10;
                target %= 10;
                int c = target;
                if (a - b == b - c) {
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }
}
