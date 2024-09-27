import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] sortedArr = new int[n];
        int[] arr = new int[n];
        Map<Integer, Integer> map = new HashMap<>();

        // 2 4 -10 4 -9
        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(st.nextToken());
            sortedArr[i] = x;
            arr[i] = x;
        }

        // -10 -9 2 4 4
        // 0 1 2 3 3
        Arrays.sort(sortedArr);
        int idx = 0;
        for (int i = 0; i < sortedArr.length; i++) {
            int key = sortedArr[i];
            if (!map.containsKey(key)) {
                map.put(key, idx);
                idx++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
            sb.append(map.get(key)).append(" ");
        }

        System.out.println(sb);
    }
}