import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        // StringTokenizer st = new StringTokenizer(br.readLine());
        // Long n = Long.parseLong(st.nextToken());
        Long n = sc.nextLong();
        List<Long> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (list.size() == n) {
                Collections.sort(list);
                for (long l : list) {
                    sb.append(l).append("\n");
                }
                System.out.println(sb);
                break;
            }

            // if (!st.hasMoreTokens()) {
            //     st = new StringTokenizer(br.readLine());
            // }
            // list.add(reverse(st.nextToken()));
            list.add(reverse(sc.nextLong()));
        }
    }

    static Long reverse(Long l) {
        StringBuilder sb = new StringBuilder().append(l).reverse();
        return Long.parseLong(sb.toString());
    }
}