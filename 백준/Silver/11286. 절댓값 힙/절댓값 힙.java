import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Absolute> pq = new PriorityQueue<>(new Comparator<Absolute>() {
            @Override
            public int compare(Absolute o1, Absolute o2) {
                if (o1.abs == o2.abs) {
                    return o1.x - o2.x;
                }
                return o1.abs - o2.abs;
            }
        });
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(br.readLine());
            if (a != 0) {
                pq.offer(new Absolute(a, Math.abs(a)));
            } else {
                if (pq.isEmpty()) {
                    sb.append(0).append("\n");
                } else {
                    sb.append(pq.poll().x).append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}

class Absolute {
    int x;
    int abs;

    public Absolute(int x, int abs) {
        this.x = x;
        this.abs = abs;
    }
}