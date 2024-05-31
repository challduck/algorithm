import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int cnt = 0;
        for (int i = 0; i < str.length() - str.length() % 10; i += 10) {
            System.out.println(str.substring(i, i + 10));
            cnt++;
        }
        System.out.println(str.substring(10 * cnt, 10 * cnt + (str.length() % 10)));
    }
}