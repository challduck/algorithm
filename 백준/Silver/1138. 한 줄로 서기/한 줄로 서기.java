import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n + 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        List<Integer> list = new ArrayList<>();

        for (int i = n; i >= 1; i--) {
            list.add(arr[i - 1], i);
        }

        StringBuilder sb = new StringBuilder();
        for (Integer integer : list) {
            sb.append(integer).append(" ");
        }

        System.out.println(sb);
    }
}
