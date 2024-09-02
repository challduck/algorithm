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
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            map.put(st.nextToken(), 0);
        }
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) {
                String key = st.nextToken();
                map.put(key, map.getOrDefault(key, 0) + 1);
            }
        }
        List<String> list = new ArrayList<>(map.keySet().stream()
                .sorted(new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                        if (map.get(o1) == map.get(o2)) {
                            return o1.compareTo(o2);
                        }
                        return map.get(o2) - map.get(o1);
                    }
                })
                .collect(Collectors.toList()));
        StringBuilder sb = new StringBuilder();
        for (String key : list) {
            sb.append(key).append(" ").append(map.get(key)).append("\n");
        }
        System.out.println(sb);
    }
}
