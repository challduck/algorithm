import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> list = new ArrayList<>();
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(list);

        for (int i = 0; i < list.size() - 1; i++) {
            if (gcd(list.get(i), list.get(i + 1)) == 1) {
                continue;
            } else {
                for (int j = list.get(i); j < list.get(i + 1); j++) {
                    if (gcd(list.get(i), j) == 1) {
                        if (gcd(list.get(i + 1), j) == 1) {
                            cnt++;
                            break;
                        }
                    }
                    if (j == list.get(i + 1) - 1) {
                        cnt += 2;
                        break;
                    }
                }
            }
        }
        System.out.println(cnt);
    }

    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
