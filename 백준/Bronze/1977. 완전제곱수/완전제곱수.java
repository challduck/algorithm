import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        int sum = 0;
        int min = Integer.MAX_VALUE;
        boolean flag = false;
        for (int i = a; i <= b; i++) {
            if (isInteger(Math.sqrt(i))) {
                sum += i;
                min = Math.min(min, i);
                flag = true;
            }
        }
        if (flag) {
            System.out.println(sum + "\n" + min);
        } else {
            System.out.println(-1);
        }
    }

    private static boolean isInteger(double n) {
        return n % 1.0 == 0.0;
    }
}