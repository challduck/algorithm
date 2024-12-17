import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] digits = br.readLine().toCharArray();
        int n = digits.length;

        int i = n - 2;
        while (i >= 0 && digits[i] >= digits[i + 1]) {
            i--;
        }

        if (i < 0) {
            System.out.println(0);
            return;
        }

        int j = n - 1;
        while (digits[j] <= digits[i]) {
            j--;
        }
        char temp = digits[i];
        digits[i] = digits[j];
        digits[j] = temp;

        int start = i + 1;
        int end = n - 1;
        while (start < end) {
            temp = digits[start];
            digits[start] = digits[end];
            digits[end] = temp;
            start++;
            end--;
        }

        System.out.println(new String(digits));
    }
}
