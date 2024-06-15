import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String hp1 = br.readLine();
        String hp2 = br.readLine();
        int[] arr = new int[16];

        int cnt = 0;
        for (int i = 0; i < 16; i++) {
            if (i % 2 == 0) {
                arr[i] = hp1.charAt(cnt) - '0';
            } else {
                arr[i] = hp2.charAt(cnt) - '0';
                cnt++;
            }
        }

        for (int i = 15; i > 1 ; i--) {
            for (int j = 0; j < i; j++) {
                arr[j] = (arr[j] + arr[j + 1]) % 10;

            }
        }
        System.out.printf("%02d\n", arr[0] * 10 + arr[1]);
    }
}