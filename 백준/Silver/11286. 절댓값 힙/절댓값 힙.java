import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int absCompare = Integer.compare(Math.abs(o1), Math.abs(o2));
                if (absCompare == 0) {
                    return Integer.compare(o1, o2);
                }
                return absCompare;
            }
        };

        PriorityQueue<Integer> pq = new PriorityQueue<>(comparator);
        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(br.readLine());
            if (x == 0) {
                System.out.println(pq.isEmpty() ? 0 : pq.poll());
            } else {
                pq.add(x);
            }
        }
    }
}