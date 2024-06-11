import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int K = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            PriorityQueue<Long> pq = new PriorityQueue<>();
            for (int j = 0; j < K; j++) {
                pq.add(Long.parseLong(st.nextToken()));
            }
            long sum = 0;
            while (pq.size() != 1) {
                
                if (!pq.isEmpty()) {
                    long first = pq.poll();
                    long second = pq.poll();
                    sum += first + second;
                    pq.add(first + second);
                }                
            }
            System.out.println(sum);
        }
    }
}
