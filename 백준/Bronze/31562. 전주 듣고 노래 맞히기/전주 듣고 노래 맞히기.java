import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str1 = br.readLine().split(" ");
        int n = Integer.parseInt(str1[0]);
        int m = Integer.parseInt(str1[1]);
        Map<String, String> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            String[] str2 = br.readLine().split(" ");
            int music_name_length = Integer.parseInt(str2[0]);
            String music_name = str2[1];

            for (int j = 2; j < 5; j++) {
                sb.append(str2[j]);
            }
            if (set.contains(sb.toString())) {
                list.add(sb.toString());
            }
            map.put(sb.toString(), music_name);
            set.add(sb.toString());
        }

        for (int i = 0; i < m; i++) {
            StringBuilder sb = new StringBuilder();
            String[] line = br.readLine().split(" ");
            for (int j = 0; j < line.length; j++) {
                sb.append(line[j]);
            }
            if (map.containsKey(sb.toString())) {

                if (set.contains(sb.toString()) && list.contains(sb.toString())) {
                    System.out.println("?");
                } else {
                    System.out.println(map.get(sb.toString()));
                }
            } else {
                System.out.println("!");
            }
            set.add(sb.toString());
        }
    }
}