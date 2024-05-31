import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.*;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < num; i++) {
            String[] str = reader.readLine().replace(".", " ").split(" ");
            map.put(str[1], map.getOrDefault(str[1], 0) + 1);
        }

        Map<String, Integer> sortedMap = new TreeMap<>(map);

        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}