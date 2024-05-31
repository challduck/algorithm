import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.*;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        String temp = reader.readLine().toUpperCase();

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < temp.length(); i++) {
            map.put(temp.charAt(i), map.getOrDefault(temp.charAt(i), 0) + 1);
        }

        int max = 0;
        for (int value : map.values()) {
            if (value > max) {
                max = value;
            }
        }

        List<Character> maxKeys = new ArrayList<>();

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max) {
                maxKeys.add(entry.getKey());
            }
        }

        if (maxKeys.size() >= 2) {
            System.out.println("?");
        } else {
            System.out.println(maxKeys.get(0));
        }
    }
}