import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        long n = Long.parseLong(br.readLine());
        long sum = 1;
        long cnt = 1;

        if (n == 1) {
            System.out.println(1);
            return;
        }

        for (int i = 1; sum < n; ++i) {
            sum += i * 6;
            cnt++;
        }
        System.out.println(cnt);
    }
}