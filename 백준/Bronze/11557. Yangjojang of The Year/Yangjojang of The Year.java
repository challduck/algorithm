import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int max = 0;
        String university = "";
        // PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for (int i = 0; i < n; i++) {
            int m = Integer.parseInt(br.readLine());
            for (int j = 0; j < m; j++) {
                String[] arr = br.readLine().split(" ");
                if (Integer.parseInt(arr[1]) > max) {
                    max = Integer.parseInt(arr[1]);
                    university = arr[0];
                }
            }
            sb.append(university).append("\n");
        }
        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb.toString());
    }

}
