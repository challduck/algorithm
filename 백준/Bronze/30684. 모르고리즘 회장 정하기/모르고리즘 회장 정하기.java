import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<String> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            if (str.length() == 3) {
                pq.add(str);
            }
        }

        System.out.println(pq.poll());
    }
}
