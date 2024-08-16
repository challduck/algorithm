import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        StringBuilder sb = new StringBuilder();
        List<Long> list = new ArrayList<>();

        for (int i = 2; i <= Math.sqrt(n); i++) {
            while (n % i == 0) {
                list.add((long) i);
                n /= i;
            }
        }

        if (n != 1) {
            list.add(n);
        }

        sb.append(list.size()).append("\n");

        for (Long l : list) {
            sb.append(l).append(" ");
        }
        System.out.println(sb);
    }
}