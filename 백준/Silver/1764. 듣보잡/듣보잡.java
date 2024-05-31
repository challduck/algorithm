import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.*;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] a_num = reader.readLine().split(" ");
        Map<String, Integer> map = new HashMap<>();
        int cnt = 0;
        for (int i = 0; i < Integer.parseInt(a_num[0]); i++) {
            String unheard = reader.readLine();
            map.put(unheard, 0);
        }

        for (int i = 0; i < Integer.parseInt(a_num[1]); i++) {
            String unsee = reader.readLine();
            if (map.get(unsee) != null) {
                map.put(unsee, map.get(unsee) + 1);
                cnt++;
            }
        }
        System.out.println(cnt);
        TreeMap<String, Integer> treeMap = new TreeMap<>(map);
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            if (entry.getValue() >= 1) {
                System.out.println(entry.getKey());
            }
        }
    }
}
