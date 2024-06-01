import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Set<String> set = new HashSet<>();

        char before_word = '1';
        char after_word = '1';
        boolean is_before = false;
        boolean is_after = false;

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            if (!str.equals("?")) {
                set.add(str);
                if (is_before && !is_after) {
                    after_word = str.charAt(0);
                    is_after = true;
                }
            } else {
                is_before = true;
            }
            if (!is_before) {
                before_word = str.charAt(str.length() - 1);
            }
        }

        int M = Integer.parseInt(br.readLine());
        if (N == 1) {
            System.out.println(br.readLine());
        } else {
            for (int i = 0; i < M; i++) {
                String str = br.readLine();
                if (!set.contains(str)) {
                    if ((str.charAt(0) == before_word || before_word == '1')
                            && (str.charAt(str.length() - 1) == after_word || after_word == '1')) {
                        System.out.println(str);
                        break;
                    }
                }
            }
        }
    }
}