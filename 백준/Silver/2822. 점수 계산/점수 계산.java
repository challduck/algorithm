import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 1; i <= 8; i++) {
            int a = Integer.parseInt(br.readLine());
            list.add(a);
            map.put(a, i);
        }

        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        int[] arr = new int[5];
        for (int i = 4; i >= 0; i--) {
            int a = list.get(i);
            sum += a;
            arr[4 - i] = map.get(list.get(i));
        }

        Arrays.sort(arr);
        sb.append(sum).append("\n");
        for (int j : arr) {
            sb.append(j).append(" ");
        }

        System.out.println(sb);
    }
}
