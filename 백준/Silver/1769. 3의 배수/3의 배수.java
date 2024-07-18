import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String str = st.nextToken();
        int sum = 0;
        int cnt = 0;

        if (str.length() == 1) {
            sum = Integer.parseInt(str);
        } else {
            for (int i = 0; i < str.length(); i++) {
                sum += Character.getNumericValue(str.charAt(i));
            }
            cnt++;
        }

        while (sum >= 10) {
            int tempSum = 0;
            while (sum > 0) {
                tempSum += sum % 10;
                sum /= 10;
            }
            sum = tempSum;
            cnt++;
        }

        System.out.println(cnt);
        if (sum % 3 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }

}