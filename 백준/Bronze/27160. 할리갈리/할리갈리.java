import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.*;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int card = Integer.parseInt(reader.readLine());
        Map<String, Integer> map = new HashMap<>();
        String bell = "NO";
        for (int i = 0; i < card; i++) {
            String[] temp = reader.readLine().split(" ");
            map.put(temp[0], map.getOrDefault(temp[0], 0) + Integer.parseInt(temp[1]));
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue().equals(5)) {
                bell = "YES";
                break;
            }
        }
        System.out.println(bell);
    }
}