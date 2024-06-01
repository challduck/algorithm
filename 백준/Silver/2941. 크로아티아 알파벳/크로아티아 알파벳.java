import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String croatia_word = br.readLine();
        String[] arr = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
        int cnt = 0;

        for (String alphabet : arr) {
            while (croatia_word.contains(alphabet)) {
                croatia_word = croatia_word.replaceFirst(alphabet, "*");
                cnt++;
            }
        }

        for (int i = 0; i < croatia_word.length(); i++) {
            if (croatia_word.charAt(i) != '*') {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
