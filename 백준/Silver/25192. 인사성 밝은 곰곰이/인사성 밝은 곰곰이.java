import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.*;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        Set<String> set = new HashSet<>();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            String str = reader.readLine();
            if (str.equals("ENTER")) {
                sum += set.size();
                set.clear();
            } else {
                set.add(str);
            }
        }
        System.out.println(sum + set.size());
    }
}
