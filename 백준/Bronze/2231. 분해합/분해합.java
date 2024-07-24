import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = 0;
        while (true) {
            String num_str = Integer.toString(m);
            int sum = m;
            for (int i = 0; i < num_str.length(); i++) {
                sum += Character.getNumericValue(num_str.charAt(i));
            }

            if (n == sum) {
                break;
            } else if (m > n) {
                m = 0;
                break;
            } else {
                m++;
            }
        }
        System.out.println(m);
    }

}
