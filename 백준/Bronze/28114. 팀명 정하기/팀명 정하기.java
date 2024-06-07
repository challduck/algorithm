import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[3];
        Map<Integer, Character> map = new LinkedHashMap<>();

        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int solved = Integer.parseInt(st.nextToken());
            int year = Integer.parseInt(st.nextToken());
            String first_name = st.nextToken();

            map.put(solved, first_name.charAt(0));
            arr[i] = year % 100;
        }

        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            sb.insert(0, arr[arr.length - i - 1]);
        }
        sb.append("\n");

        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list);
        Collections.reverse(list);
        for (Integer integer : list) {
            sb.append(map.get(integer));
        }

        System.out.println(sb.toString());
    }
}