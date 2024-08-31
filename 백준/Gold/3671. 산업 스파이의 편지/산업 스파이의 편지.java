import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static boolean[] isPrime = new boolean[10000001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int c = Integer.parseInt(br.readLine());
        setPrimeArray();

        for (int i = 0; i < c; i++) {
            Set<Integer> set = getNumList(br.readLine());
            int cnt = 0;
            for (int num : set) {
                if (isPrime[num]) {
                    cnt++;
                }
            }
            sb.append(cnt).append("\n");
        }
        System.out.print(sb);
    }

    public static Set<Integer> getNumList(String number) {
        Set<Integer> result = new HashSet<>();
        boolean[] used = new boolean[number.length()];
        StringBuilder current = new StringBuilder();
        genNumList(number, used, current, result);
        return result;
    }

    private static void genNumList(String number, boolean[] used, StringBuilder current,
            Set<Integer> result) {
        if (current.length() > 0) {
            int num = Integer.parseInt(current.toString());
            if (num > 1) {
                result.add(num);
            }
        }

        for (int i = 0; i < number.length(); i++) {
            if (!used[i]) {
                used[i] = true;
                current.append(number.charAt(i));
                genNumList(number, used, current, result);
                current.setLength(current.length() - 1);
                used[i] = false;
            }
        }
    }

    private static void setPrimeArray() {
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i <= 10000000; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= 10000000; j += i) {
                    isPrime[j] = false;
                }
            }
        }
    }
}