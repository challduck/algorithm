import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int width = Integer.parseInt(st.nextToken());
            if (width == 136) {
                sum += 1000;
            } else if (width == 142) {
                sum += 5000;
            } else if (width == 148) {
                sum += 10000;
            } else if (width == 154) {
                sum += 50000;
            }
        }
        System.out.println(sum);
    }
}
