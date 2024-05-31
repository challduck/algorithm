import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.*;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str;
        Set<Integer> set = new HashSet<>();

        while ((str = reader.readLine()) != null && !str.isEmpty()) {
            set.add(Integer.parseInt(str) % 42);
        }

        System.out.println(set.size());
    }
}