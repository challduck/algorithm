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
            String[] str = reader.readLine().split(" ");

            if (str[1].equals("enter")) {
                map.put(str[0], map.getOrDefault(str[0], 0) + 1);
            } else {
                map.put(str[0], map.getOrDefault(str[0], 0) - 1);
            }
        }

        List<String> list = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= 1) {
                list.add(entry.getKey());
            }
        }
        Collections.sort(list);
        Collections.reverse(list);
        for (String string : list) {
            System.out.println(string);
        }
    }
}