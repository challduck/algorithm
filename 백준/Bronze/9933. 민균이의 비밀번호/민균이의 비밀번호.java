import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();
        String res = "";
        boolean isPalindrome = false;

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            String reverse = new StringBuilder(str).reverse().toString();

            if (str.charAt(0) == str.charAt(str.length() - 1)) {
                for (int j = 0; j < str.length() / 2; j++) {
                    if (str.charAt(j) == str.charAt(str.length() - j - 1)) {
                        isPalindrome = true;
                        res = str;
                    } else {
                        isPalindrome = false;
                        res = "";
                    }
                }
            }
            if (isPalindrome) {
                break;
            }
            if (set.contains(reverse)) {
                res = str;
                break;
            }

            set.add(str);
        }

        if (res.length() != 0) {
            System.out.println(res.length() + " " + res.charAt(res.length() / 2));
        }

    }
}