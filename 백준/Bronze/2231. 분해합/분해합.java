import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        boolean flag = false;
        for (int i = 0; i < n; i++) {
            String str = Integer.toString(i);
            int sum = i;

            for (int j = 0; j < str.length(); j++) {
                sum += Character.getNumericValue(str.charAt(j));
            }

            if (sum == n) {
                flag = true;
                System.out.println(str);
                return;
            }
        }

        if (!flag) {
            System.out.println(0);
        }

    }
}