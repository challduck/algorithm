import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] coordinates = new int[n];
        for (int i = 0; i < n; i++) {
            coordinates[i] = Integer.parseInt(st.nextToken());
        }

        int[] sort_coordinates = coordinates.clone();
        Arrays.sort(sort_coordinates);

        Map<Integer, Integer> map = new HashMap<>();
        int rank = 0;
        for (int i = 0; i < sort_coordinates.length; i++) {
            if (!map.containsKey(sort_coordinates[i])) {
                map.put(sort_coordinates[i], rank++);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(map.get(coordinates[i])).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}