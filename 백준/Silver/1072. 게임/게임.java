import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long X = Integer.parseInt(st.nextToken());
        long Y = Integer.parseInt(st.nextToken());
        long Z = (Y * 100) / X;

        if (Z >= 99) {
            System.out.println(-1);
        } else {
            long start = 1;
            long end = X;
            long result = -1;
            while (start <= end) {
                long mid = (start + end) / 2;
                long sum = ((Y + mid) * 100) / (X + mid);

                if (sum > Z) {
                    result = mid;
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            System.out.println(result);
        }
    }
}