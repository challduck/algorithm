import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[] zero = new int[41];
    static int[] one = new int[41];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        fibonacci();

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            sb.append(zero[n] + " " + one[n]).append("\n");
        }
        System.out.println(sb);
    }

    static void fibonacci() {
        zero[0] = 1;
        one[0] = 0;
        for (int i = 1; i <= 40; i++) {
            zero[i] = one[i - 1];
            one[i] = zero[i - 1] + zero[i];
        }
    }
}