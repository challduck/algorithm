import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> list = primeList(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        for (Integer integer : list) {
            sb.append(integer).append("\n");
        }
        System.out.println(sb);
    }

    private static List<Integer> primeList(int start, int end) {
        boolean[] isPrime = new boolean[end + 1];

        for (int i = 2; i <= end; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i <= end; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= end; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        List<Integer> list = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            if (isPrime[i]) {
                list.add(i);
            }
        }

        return list;
    }
}