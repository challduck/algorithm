import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        int count = 1;
        Set<String> set = new HashSet<>();
        for (int length = 1; length <= str.length(); length++) {
            for (int start = 0; start <= str.length() - length; start++) {
                String subStr = str.substring(start, start + length);
                set.add(subStr);
            }
        }
        System.out.println(set.size());
    }
}