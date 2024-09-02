import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        Map<String, Integer> map = new HashMap<>();
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String key = st.nextToken();
            map.put(key, map.getOrDefault(key, 0) + Integer.parseInt(st.nextToken()));
        }

        List<String> list = new ArrayList<>(
                map.keySet().stream().sorted(new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                        if (o1.length() == o2.length()) {
                            return o1.compareTo(o2);
                        }
                        return o1.length() - o2.length();
                    }
                }).collect(Collectors.toList()));
        StringBuilder sb = new StringBuilder();
        for (String string : list) {
            sb.append(string).append(" ").append(map.get(string)).append("\n");
        }
        System.out.println(sb);
    }
}