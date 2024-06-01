import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();

        int[] arr = new int[26];
        for (char c : word.toCharArray()) {
            arr[c - 'A']++;
        }

        int odd = 0;
        for (int i : arr) {
            if (i % 2 != 0) {
                if (i % 2 != 0) {
                    odd++;
                }
            }
        }

        if (odd > 1) {
            System.out.println("I'm Sorry Hansoo");
            return;
        }

        StringBuilder sb = new StringBuilder();
        String center = "";

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                center = String.valueOf((char) (i + 'A'));
                arr[i]--;
            }
            for (int j = 0; j < arr[i] / 2; j++) {
                sb.append((char) (i + 'A'));
            }
        }

        System.out.println(sb.toString() + center + sb.reverse().toString());

    }
}
